package com.akshay.techstack.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class TechstackControllerTest {
	
//	@Mock
	public TechstackController techstackController;
	
	@BeforeEach
	public void beforeAll() {
		techstackController = spy(TechstackController.class);
	}

	@Test
	void testGetRelatedTechStackForFrontend() {
		//TechstackController tech = mock(TechstackController.class);
		//when(tech.getRelatedTechStack("frontend")).thenReturn(anyList());
		List<String> ll = techstackController.getRelatedTechStack("frontend");
		assertNotNull(ll);
		System.out.println("frontend tech stack : " + ll);
		System.out.println("testGetRelatedTechStackForFrontend run successfully...");
	}
	
	@Test
	void testGetRelatedTechStackForAnyOther() {
		//TechstackController tech = mock(TechstackController.class);
		//when(tech.getRelatedTechStack("frontend")).thenReturn(anyList());
		List<String> ll = techstackController.getRelatedTechStack("blabla");
		assertNotNull(ll);
		assertEquals(1, ll.size());
		System.out.println("testGetRelatedTechStackForAnyOther run successfully..." + ll);
	}

}
