import java.util.*;

public class JavaCollection {

  public static void main(String[] args) {


    // ----------SHORTED
    // STORES----------------------------------------------------------------
    // Set<Integer> set = new TreeSet<Integer>();

    // ------ STORES IN ORDERD--
    // Set<Integer> set = new LinkedHashSet<Integer>();

    // ------STORES IN Un-ORDERD--
    // Set<Integer> set = new HashSet<Integer>();

    // set.addAll(Arrays.asList(100,2,30,45,500));
    // System.err.println(set);
    // set.add(10);
    // set.add(20);
    // System.out.println(set);
    //
    // System.out.println(set.contains(100));
    // System.err.println(set.remove(20));
    // System.out.println(set);

    //set.clear();
    //System.out.println(set);

    // System.out.println("---ARRAYDEQUE sTARTED--");
    // ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
    // queue.offer(1);
    // queue.offer(3);
    // queue.offerFirst(4);
    // queue.offerLast(5);
    // queue.offer(6);
    // System.out.println(queue);
    //
    // //System.out.println(queue.size());
    // System.out.println(queue.peek());
    // System.out.println(queue.peekLast());
    //
    // System.out.println(queue.poll());
    // System.out.println(queue);
    // System.out.println(queue.pollLast());
    // System.out.println(queue);

    // Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
    //
    //
    // pq.offer(100);
    // pq.offer(4);
    // pq.offer(55);
    // pq.offer(150);
    // pq.offer(47);
    // System.out.println(pq);
    //
    // pq.poll();;
    // System.out.println(pq);
    //
    // System.out.println(pq.peek());
    // List<Integer> list = new ArrayList<>();

    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    //
    // //using INdex
    // list.add(0,50);
    //
    // System.out.println(list);

    // ArrayList<Integer> newList=new ArrayList<>();
    // newList.add(10);
    // newList.add(20);
    // newList.add(30);
    // newList.add(40);
    // System.out.println("Second"+newList);

    // for(int i=0;i<=newList.size()-1;i++){
    // System.out.println("The "+(i + 1)+" Element is :"+newList.get(i));
    // }
    //
    // for (Integer element : newList){
    // System.out.println("For Each Element is :"+element);
    // }
    // Iterator<Integer> it =newList.iterator();
    // while (it.hasNext())
    // {
    // System.out.println("Iterator Element is"+it.next());
    //
    // }
    //

    // Set New Value
    // newList.set(0,1000);
    // System.out.println("Second"+newList);

    // Check Value
    // boolean value =newList.contains(40);
    // System.err.println(value);

    // Size
    // System.out.println(newList.size());

    // //Mergig List
    // list.addAll(newList);
    // System.err.println(list);
    //
    // //Get element
    // System.out.println(list.get(0));
    //
    // //remove element
    // newList.remove(0);
    // System.out.println(newList);
    // newList.remove(Integer.valueOf(30));
    // System.err.println(newList);
    //
    // newList.clear();
    // list.clear();
    // System.err.println(newList);
    // System.err.println(list);

    // System.out.println("-------------------------------------------");
    // System.out.println("Stack Started");
    //
    // Stack<String> stack =new Stack<String>();
    // stack.push("ABC");
    // stack.push("PQR");
    // stack.push("CAT");
    // stack.push("DOG");
    // stack.push("Elephent");
    // System.out.println(stack);
    // System.out.println(stack.peek());
    // stack.pop();
    // System.out.println(stack.peek());
    //
    // System.out.println("-------------------------------------------");
    // System.out.println("QUEUE Started");
    //
    // Queue<Integer> queue = new LinkedList<Integer>();
    //
    // //add() throws exception
    // queue.add(10);
    // //Offer Retirn true or false
    // queue.offer(20);
    // queue.offer(30);
    // queue.offer(40);

    // element() throws exception
    // System.err.println(queue.element());
    // //Peek returns null if not find
    // System.out.println(queue.peek());
    //
    // remove() throws exception
    // System.err.println(queue.remove());
    // //poll returns null if not find
    // System.out.println(queue.poll());
    // System.out.println(queue);

    //===============MAP CLASS STARTED =================================================
         Map<String,Integer> map=new TreeMap<>();
         //Map<String,Integer> map=new HashMap<>();
         map.put("one",1);
         map.put("two",2);
            map.put("three",3);
            map.put("three",50);
           
           
           if(!map.containsKey("four")){
               map.put("four",50);
          } 
           //map.putIfAbsent("three", 50);
           map.put("four",4);
           map.put("five",5);
         
            System.out.println(map);
      //ITERATION
        for(Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.println(entry.getValue()+ "==" + entry.getKey());
    
            }
    
      for(String key : map.keySet()){
          System.out.println("ONLY KEYS= "+key);
        }
        for(Integer value : map.values()){
            System.out.println("ONLY VALUES= "+value);
        }
    //===============MAP CLASS ENDED =================================================

      //===============ARRAYS CLASS STARTED =================================================

      //BINARY SERACH
     int[]  number = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     int index =Arrays.binarySearch(number,4);
     System.out.println("INDEX OF 4 IS "+index);

     //SORITNG ARRAYs
     Integer[] num={40,32,12,4,56,334,55,23,45};
     Arrays.sort(num);
     System.out.println("SORTED ARRAY : ");
     for (int i:num){
      
      System.out.print(i+" ");
     }
      
  }
      
}