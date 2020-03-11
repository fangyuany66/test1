package dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao{
	@Override
	public void sayHello() {
		System.out.println("宋方圆-软件173-201707228 ");
	}
}
