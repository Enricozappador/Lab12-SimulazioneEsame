package it.polito.tdp.model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultWeightedEdge;

import it.polito.tdp.db.EventsDao;

public class Simulatore {
	//tipi di evento 
	//1. evento criminoso 
	//1.1 selezionare l'agente più vicino 
	//1.2 setta l'agente comoe occupato 
	//2. arrivo agente 	
	//2.1 controlla se sarà evento malgestito 
	//3. crimine terminato 
	//3.1 Libero l'agente 
	
	
	private Integer malGestiti;
	private Integer N;
	private Integer anno;
	private Integer mese;
	private Integer giorno; 
	private Graph<Integer, DefaultWeightedEdge> grafo;
	private PriorityQueue<Evento> queue;
	
	
	//mappa di distretto-#agenti
	private Map<Integer, Integer> agenti;
	
	private void init(Integer N, Integer anno, Integer mese, Integer giorno, Graph<Integer, DefaultWeightedEdge> grafo) {
		this.N = N;
		this.anno = anno;
		this.mese = mese;
		this.giorno = giorno;
		this.grafo = grafo;
		
		this.malGestiti = 0; 
		this.agenti = new HashMap<Integer, Integer>();
		for(Integer d : this.grafo.vertexSet()) {
			this.agenti.put(d, 0);
			
		}
		
		EventsDao dao = new EventsDao();
		Integer minD = dao.getDistrettoMin(anno);
		

	}
	
	public void run()
	{
		
	}
}
