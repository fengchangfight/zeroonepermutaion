import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Long calculate(Integer m, Integer n, Map<String, Long> record){
        String key = m.toString()+"_"+n.toString();
        if(record.get(key)!=null){
            return record.get(key);
        }
        if(n.equals(0)){
            record.put(key, 1L);
            return 1L;
        }
        if(m.equals(1)){
            record.put(key, Long.valueOf(n+1));
            return Long.valueOf(n+1);
        }else{
            Long sum = 0L;
            for(int i = 0; i<=n; i++){
                sum+=calculate(m-1,n-i, record);
            }
            record.put(key, sum);
            return sum;
        }
    }

    public static void printCalculate(Integer m, Integer n){
        String key = m.toString()+"_"+n.toString();

        if(n.equals(0)){
            record.put(key, 1L);
            return 1L;
        }
        if(m.equals(1)){
            record.put(key, Long.valueOf(n+1));
            return Long.valueOf(n+1);
        }else{
            Long sum = 0L;
            for(int i = 0; i<=n; i++){
                sum+=calculate(m-1,n-i, record);
            }
            record.put(key, sum);
            return sum;
        }
    }

    public static Long permutation(Integer m, Integer n){
        Map<String, Long> record = new HashMap();
        return calculate(m, n, record);
    }

    public static Long printPermutation(Integer m, Integer n){
        Map<String, Long> record = new HashMap();
        return printCalculate(m, n, record);
    }

    public static void main(String[] arsg){
        System.out.println(permutation(14,13));
    }
}
