package com.akhm.admin.bo.impl;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.akhm.admin.bo.AdminBO;
import com.akhm.admin.dao.AdminDAO;
import com.akhm.admin.dao.model.AdminTl;

import org.junit.Assert;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
public class AdminBOImplTest {
	@Mock
	private AdminBO adminBO;
	@Mock
	private AdminDAO adminDAO;
	@Test
	public void testGetAdmin() throws Exception {
		AdminTl adminTl = new AdminTl();
		Mockito.when(adminDAO.findByEmailIdAndPassword("samara393@gmail.com", "123456")).thenReturn(adminTl);
		AdminTl admin = adminBO.getAdmin("samara393@gmail.com", "123456");
		Assert.assertNull(admin);
		
	}
}