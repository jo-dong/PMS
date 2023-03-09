package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	
	// 페이지 번호
	private int pageNum;
	// 한 페이지 당 몇 개의 데이터를 보여줄 것인가
	private int amount;
	
	private String type;
	private String keyword;
	
	// 1 페이지당 10개의 리스트
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		return type == null ? new String[] {} : type.split("");
	}
	
	public String getListLink() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
									   .queryParam("pageNum", this.pageNum)
									   .queryParam("amount", this.getAmount())
									   .queryParam("type", this.getType())
									   .queryParam("keyword", this.getKeyword());
		return builder.toUriString();
	}
}
