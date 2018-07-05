/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.algo.ta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author bim
 */
public class BFS {
    Queue<Node> q;
    ArrayList<Node> nodes = new ArrayList<Node>();
    
    static class Node {
        int data;
        boolean kunjung;
        List<Node> tetangga;
        
        // Constructor
        Node(int data) {
            this.data = data;
            this.tetangga = new ArrayList<>();
        }
        
        // Tambah tetangga
        public void tbhTetangga(Node nodeTetangga) {
            this.tetangga.add(nodeTetangga);
        }
        
        // Getter tetangga
        public List<Node> getTetangga() {
            return tetangga;
        }
        
        // Setter tetangga
        public void setTetangga(List<Node> tetangga) {
            this.tetangga = tetangga;
        }
    }
			
 BFS() {  
        q = new LinkedList<Node>();  
    }
 
 void bfs(Node node) {  
        q.add(node);  
        node.kunjung = true;  
        while (!q.isEmpty()) 
        {  
            Node element = q.remove();  
            System.out.println(element.data + " ");  
            List<Node> neighbours = element.getTetangga();  
            for (int i = 0; i < neighbours.size(); i++) 
            {  
                Node n = neighbours.get(i);  
                if (n != null && !n.kunjung) 
                {  
                q.add(n);  
                n.kunjung = true; 
                }  
            }  
        }  
    }	
}
