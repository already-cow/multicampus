package org.galapagos.service;

import static org.junit.Assert.*;

import org.galapagos.config.RootConfig;
import org.galapagos.domain.BoardVO;
import org.galapagos.mapper.BoardMapper;
import org.galapagos.mapper.BoardMapperTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class })
@Log4j
public class BoardServiceTest {

	@Autowired
	private BoardService service;

//	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");

		service.register(board);

		log.info("생성된 게시물의 번호: " + board.getBno());
	}

	@Test
	public void testGet() {
		log.info(service.get(1L));
	}

//	@Test
	public void testModify() {
		BoardVO board = service.get(1L);
		if (board == null) {
			return;
		}
		board.setTitle("제목수정합니다.");
		log.info("MODIFY RESULT: " + service.modify(board));
	}

//	@Test
	public void testDelete() {
		// 게시물번호의존재여부를확인하고테스트할것
		log.info("REMOVE RESULT: " + service.remove(1L));
	}

//	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
	}

}
