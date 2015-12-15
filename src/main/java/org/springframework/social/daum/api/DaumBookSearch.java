package org.springframework.social.daum.api;

public class DaumBookSearch {

	private String author_t;
	private String sale_price;
	private String cover_s_url;
	private String sale_yn;
	private String pub_date;
	private String link;
	private String barcode;
	private String etc_author;
	private String status_des;
	private String author;
	private String title;
	private String category;
	private String translator;
	private String pub_nm;
	private String description;
	private String isbn;
	private String ebook_barcode;
	private String isbn13;
	private String cover_l_url;
	private String list_price;

	public String getAuthor_t() {
		return author_t;
	}

	public String getSale_price() {
		return sale_price;
	}

	public String getCover_s_url() {
		return cover_s_url;
	}

	public String getSale_yn() {
		return sale_yn;
	}

	public String getPub_date() {
		return pub_date;
	}

	public String getLink() {
		return link;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getEtc_author() {
		return etc_author;
	}

	public String getStatus_des() {
		return status_des;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getTranslator() {
		return translator;
	}

	public String getPub_nm() {
		return pub_nm;
	}

	public String getDescription() {
		return description;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getEbook_barcode() {
		return ebook_barcode;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public String getCover_l_url() {
		return cover_l_url;
	}

	public String getList_price() {
		return list_price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DaumBookSearch [author_t=");
		builder.append(author_t);
		builder.append(", sale_price=");
		builder.append(sale_price);
		builder.append(", cover_s_url=");
		builder.append(cover_s_url);
		builder.append(", sale_yn=");
		builder.append(sale_yn);
		builder.append(", pub_date=");
		builder.append(pub_date);
		builder.append(", link=");
		builder.append(link);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", etc_author=");
		builder.append(etc_author);
		builder.append(", status_des=");
		builder.append(status_des);
		builder.append(", author=");
		builder.append(author);
		builder.append(", title=");
		builder.append(title);
		builder.append(", category=");
		builder.append(category);
		builder.append(", translator=");
		builder.append(translator);
		builder.append(", pub_nm=");
		builder.append(pub_nm);
		builder.append(", description=");
		builder.append(description);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", ebook_barcode=");
		builder.append(ebook_barcode);
		builder.append(", isbn13=");
		builder.append(isbn13);
		builder.append(", cover_l_url=");
		builder.append(cover_l_url);
		builder.append(", list_price=");
		builder.append(list_price);
		builder.append("]");
		return builder.toString();
	}
}
