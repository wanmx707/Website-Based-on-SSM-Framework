package com.wmx.op.po;

public class PictureCustom extends Picture {
	//页数
		private Integer pageNo;
		//页面大小
		private Integer pageSize;
		public Integer getPageNo() {
			return pageNo;
		}
		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}
		public Integer getPageSize() {
			return pageSize;
		}
		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}	
}
