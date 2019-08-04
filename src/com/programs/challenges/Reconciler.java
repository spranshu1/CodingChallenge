package com.programs.challenges;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Reconciler {

    static Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending, Stream<Stream<ProcessedTransaction>> processed) {
        
    	if(pending == null && processed == null) {
    		return Stream.empty();
    	} else if(pending != null && processed == null ) {
    		return pending;
    	}
    	
    	    	
    	Optional<Stream<PendingTransaction>> temp = Optional.ofNullable(pending).filter(Objects::nonNull);
    	
    	
    	Set<Long> pendingSet = pending.filter(p -> p.map(PendingTransaction::getId)).collect(Collectors.toSet());
    	
    	
    	
    	List<Stream<ProcessedTransaction>> processedTransactionList = processed
    		    				.filter(Objects::nonNull)
    		    				.map(s -> s.filter(Objects::nonNull)
    		    						.filter(p -> pendingSet.contains(Long.parseLong(p.getId())))
    		    						.filter(p -> p.getStatus().equals("DONE"))
    		    					)
    		    				.collect(Collectors.toList());
    	
    	
    	
    	
    	return null;
    }
    
    
    public static void main(String[] args) {
    	
    	reconcile(null, null);
    	
    	
    	Set<String> pending = pendingTransactionStream.map(PendingTransaction::getTransactionId)
                .collect(Collectors.toSet());
List<ProcessedTransaction> processed = 
processedTransactionStream.filter(pt -> pending.contains(pt.getTransactionId()))
.collect(Collectors.toList());
		
	}

}