package codesoft.StudentManagementSystem;

import java.util.List;

public interface StudentManagementSystemInterface<T,K> {

		void createNew(T t);
		
		void update(T t);
				
		T getOneById(K id);

		void deleteById(K id);
		
		List<T> getAll();
		
}