package design.pat.creational;

/**
 * 
 * @author younes Example in java that are using Builder DP : StringBuilder,
 *         DocumentBuilder, Locale.Builder
 *
 */
public class BuilderPat {

	private final String msisdn;
	private final Long productId;
	private final String trxId;

	private BuilderPat(Builder builder) {
		this.msisdn = builder.msisdn;
		this.productId = builder.productId;
		this.trxId = builder.trxId;
	}

	public static class Builder {

		private String msisdn;
		private Long productId;
		private String trxId;

		public Builder() {

		}

		public BuilderPat build() {
			return new BuilderPat(this);
		}

		public Builder msisdn(String msisdn) {
			this.msisdn = msisdn;
			return this;
		}

		public Builder productId(Long productId) {
			this.productId = productId;
			return this;
		}

		public Builder trxId(String trxId) {
			this.trxId = trxId;
			return this;
		}

	}

	public String getMsisdn() {
		return msisdn;
	}

	public Long getProductId() {
		return productId;
	}

	public String getTrxId() {
		return trxId;
	}

}
