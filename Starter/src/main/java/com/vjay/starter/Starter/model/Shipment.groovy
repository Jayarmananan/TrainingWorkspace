package com.vjay.starter.Starter.model

import groovy.transform.Canonical

@Canonical
class Shipment {
	Long batchId;
	Date shipmentDate, renewalDate
	int quantity,invStatus
}
