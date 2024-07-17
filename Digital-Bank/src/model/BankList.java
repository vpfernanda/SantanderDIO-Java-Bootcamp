package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class BankList {
    private TreeMap<Integer,Bank> bankList;

    public BankList() {
        bankList = new TreeMap<Integer,Bank>();
    }

    public BankList(String txtPath){
        bankList = new TreeMap<Integer,Bank>();
        importTreeMapFromTxt(txtPath);
    }

    public boolean addBankToTreeMap(Bank bank){
        for (Bank b : bankList.values()){
            if(b.getBankName().equalsIgnoreCase(bank.getBankName()))
                return false;
        }
        Integer key = bankList.size()+1;
        bankList.put(key,bank);
        return true;
    }

    @Override
    public String toString() {
        String toReturn="";
        for (Map.Entry<Integer, Bank> entry : bankList.entrySet()){
            toReturn += entry.getKey() + " - " + entry.getValue().getBankName() + "\n";
        }
        return toReturn;
    }

    public boolean saveBanksToTxt(String txtPath){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtPath))) {
            for (Map.Entry<Integer, Bank> entry : bankList.entrySet()) {
                bw.write(entry.getKey() + " - " + entry.getValue().getBankName());
                bw.newLine(); // Adiciona uma nova linha após cada entrada
            }
            bw.close();
            return true;
        }
            
        catch(IOException e){
            return false;
        }

    }

    private boolean importTreeMapFromTxt(String txtPath){
        try (BufferedReader br = new BufferedReader(new FileReader(txtPath))){
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                counter++;
                bankList.put(extractKeyFromLineTxt(line), new Bank(extractValueFromLineTxt(line)));
            }
            br.close();
            return counter == bankList.size();
                
        }
        catch(IOException e){
            return false;
        }
    }

    private Integer extractKeyFromLineTxt(String line){
        String [] parts = line.split(" - ");
        Integer key = Integer.parseInt(parts[0]);
        return key;
    }

    private String extractValueFromLineTxt(String line){
        String [] parts = line.split(" - ");
        String value = parts[1];
        return value;
    }

    public Bank getBankByKey(Integer key){
        return bankList.get(key);
    }

    public int getMapSize(){
        return bankList.size();
    }
    
    

}
