package com.example.dao;

import com.example.bean.BoardVO;
import com.example.util.JDBCUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;


	/*Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;*/

	/* private final String BOARD_INSERT = "insert into BOARD (category, title, writer, content, fileName) values (?, ?, ?, ?, ?)";
	private final String BOARD_UPDATE = "update BOARD set category=?, title=?, writer=?, content=?, fileName=? where seq=?";
	private final String BOARD_DELETE = "delete from BOARD  where seq=?";
	private final String BOARD_GET = "select * from BOARD  where seq=?";
	private final String BOARD_LIST = "select * from BOARD order by seq desc"; */

	public int insertBoard(BoardVO vo) {
		String sql ="insert into BOARD(title, writer, content, category) values ("
				+ "'" + vo.getTitle() + "',"
				+ "'" + vo.getWriter() + "',"
				+ "'" + vo.getCategory() + "',"
				+ "'" + vo.getContent() + "')";
				return jdbcTemplate.update(sql);
	}

	public int deleteBoard(int seq) {
		String sql = "delete from BOARD where seq = "+ seq;
		return jdbcTemplate.update(sql);
	}

	public int updateBoard(BoardVO vo) {
		String sql = "update BOARD set title ='" +vo.getTitle() + "',"
				+ "title='" + vo.getTitle() + "',"
				+ "writer='" + vo.getWriter() + "',"
				+ "content='" + vo.getContent() + "',"
				+ "category= '"+ vo.getCategory() + "'where seq= " + vo.getSeq();
		return jdbcTemplate.update(sql);
	}
	class BoardRowMapper implements RowMapper<BoardVO> {
		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO vo = new BoardVO();
			vo.setSeq(rs.getInt("seq"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("writer"));
			vo.setCategory(rs.getString("category"));
			vo.setRegdate(rs.getDate("regdate"));
			return vo;
		}
	}

		public BoardVO getBoard(int seq) {
			String sql ="select * from BOARD where seq= " + seq;
			return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
		}

		public List<BoardVO> getBoardList() {
			String sql ="select * from BOARD order by regdate desc";
			return jdbcTemplate.query(sql, new BoardRowMapper());
		}
	}




	/*public int insertBoard(BoardVO vo) {
		return template.update(BOARD_INSERT, new Object[]{
				vo.getCategory(), vo.getTitle(), vo.getWriter(), vo.getContent()});
	}
	public void deleteBoard(BoardVO vo) {
		return template.update(BOARD_DELETE, new Object[]{id});
	}

	public int updateBoard(BoardVO vo) {
		return template.update(BOARD_UPDATE, new Object[]{
				vo.getCategory(), vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getSeq()});
	}
	
	public BoardVO getBoard(int seq) {
		return template.queryForObject(BOARD_GET,
				new Object[] {seq},
				new BeamPropertyRowMapper<BoardVO>(BoardVO.class));
	}
	
	public List<BoardVO> getBoardList(){
		String sql = "select * from BOARD order by the regdate desc";
		return jdbcTemplate.query(sql,new BoardRowMapper());
			}
		}
	}
}*/