package ee.itcollege.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

public class StaticNumberService implements INumberService {

	@Override
	public List<Integer> getNumbers() {
		return Arrays.asList(1, 3, 6, 1, 7, 9);
	}
	

}
