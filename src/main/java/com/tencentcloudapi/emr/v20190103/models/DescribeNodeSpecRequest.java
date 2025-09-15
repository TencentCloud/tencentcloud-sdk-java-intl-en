/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeSpecRequest extends AbstractModel {

    /**
    * Availability zone (AZ) ID. https://document.capi.woa.com/document/api/1605/76892 can be accessed for related information.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 0: pay-as-you-go; 1: yearly/monthly subscription; 99: a combination of pay-as-you-go and yearly/monthly subscription. Invalid values will suppress billing display.
    */
    @SerializedName("CvmPayMode")
    @Expose
    private Long CvmPayMode;

    /**
    * Node type: Master,Core,Task,Router,All.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 0: old billing page; 1: new billing page. Invalid values will be deemed to be old billing by default.
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * Product ID. If left blank, the value is "0". This field is used to represent the product ID in all situations. It is required in front-end scenarios.

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Scenario name.
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * The type can be ComputeResource, EMR, or a default value. The default value is EMR.
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * Computing resource ID.
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get Availability zone (AZ) ID. https://document.capi.woa.com/document/api/1605/76892 can be accessed for related information. 
     * @return ZoneId Availability zone (AZ) ID. https://document.capi.woa.com/document/api/1605/76892 can be accessed for related information.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone (AZ) ID. https://document.capi.woa.com/document/api/1605/76892 can be accessed for related information.
     * @param ZoneId Availability zone (AZ) ID. https://document.capi.woa.com/document/api/1605/76892 can be accessed for related information.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 0: pay-as-you-go; 1: yearly/monthly subscription; 99: a combination of pay-as-you-go and yearly/monthly subscription. Invalid values will suppress billing display. 
     * @return CvmPayMode 0: pay-as-you-go; 1: yearly/monthly subscription; 99: a combination of pay-as-you-go and yearly/monthly subscription. Invalid values will suppress billing display.
     */
    public Long getCvmPayMode() {
        return this.CvmPayMode;
    }

    /**
     * Set 0: pay-as-you-go; 1: yearly/monthly subscription; 99: a combination of pay-as-you-go and yearly/monthly subscription. Invalid values will suppress billing display.
     * @param CvmPayMode 0: pay-as-you-go; 1: yearly/monthly subscription; 99: a combination of pay-as-you-go and yearly/monthly subscription. Invalid values will suppress billing display.
     */
    public void setCvmPayMode(Long CvmPayMode) {
        this.CvmPayMode = CvmPayMode;
    }

    /**
     * Get Node type: Master,Core,Task,Router,All. 
     * @return NodeType Node type: Master,Core,Task,Router,All.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type: Master,Core,Task,Router,All.
     * @param NodeType Node type: Master,Core,Task,Router,All.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 0: old billing page; 1: new billing page. Invalid values will be deemed to be old billing by default. 
     * @return TradeType 0: old billing page; 1: new billing page. Invalid values will be deemed to be old billing by default.
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 0: old billing page; 1: new billing page. Invalid values will be deemed to be old billing by default.
     * @param TradeType 0: old billing page; 1: new billing page. Invalid values will be deemed to be old billing by default.
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get Product ID. If left blank, the value is "0". This field is used to represent the product ID in all situations. It is required in front-end scenarios.

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0 
     * @return ProductId Product ID. If left blank, the value is "0". This field is used to represent the product ID in all situations. It is required in front-end scenarios.

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID. If left blank, the value is "0". This field is used to represent the product ID in all situations. It is required in front-end scenarios.

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     * @param ProductId Product ID. If left blank, the value is "0". This field is used to represent the product ID in all situations. It is required in front-end scenarios.

44	EMR	V3.5.0
43	EMR	V3.4.0.tlinux
42	EMR	V2.7.0.tlinux
41	DRUID	V1.1.0
67	STARROCKS	V2.2.0
45	DRUID	V1.1.0.tlinux
40	EMRCLOUD	v3.2.0
47	EMR	V4.0.0
48	STARROCKS	V1.2.0
49	STARROCKS	V1.3.0
50	KAFKA	V2.0.0
51	STARROCKS	V1.4.0
52	EMR-TKE	V1.0.0
53	EMR	V3.6.0
54	STARROCKS	V2.0.0
55	EMR-TKE	V1.0.1
56	EMR-TKE	DLCV1.0.0
57	EMR	V2.8.0
58	EMR	V3.6.1
59	SERVERLESS	V1.0.0
60	EMR-TKE	V1.1.0
62	STARROCKS	V2.1.1
63	STARROCKS	V2.1.1.tlinux
64	EMR-TKE	TCCV1.0.0
65	EMR-TKE-AI	V1.0.0
66	RSS	V1.0.0
24	EMR	TianQiong-V1.0.0
3	EMR	V2.0.1.tlinux
4	EMR	V2.1.0
7	EMR	V3.0.0
8	EMR	V3.0.0.tlinux
9	EMR	V2.2.0
11	CLICKHOUSE	V1.0.0
12	CLICKHOUSE	V1.0.0.tlinux
16	EMR	V2.3.0
17	CLICKHOUSE	V1.1.0
18	CLICKHOUSE	V1.1.0.tlinux
19	EMR	V2.4.0
20	EMR	V2.5.0
21	USERCUSTOM	V1.0.0
22	CLICKHOUSE	V1.2.0
39	STARROCKS	V1.1.0
25	EMR	V3.1.0
26	DORIS	V1.0.0
27	KAFKA	V1.0.0
28	EMR	V3.2.0
29	EMR	V2.5.1
30	EMR	V2.6.0
32	DORIS	V1.1.0
33	EMR	V3.2.1
34	EMR	V3.3.0
35	DORIS	V1.2.0
36	STARROCKS	V1.0.0
37	EMR	V3.4.0
38	EMR	V2.7.0
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Scenario name. 
     * @return SceneName Scenario name.
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario name.
     * @param SceneName Scenario name.
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get The type can be ComputeResource, EMR, or a default value. The default value is EMR. 
     * @return ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR.
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set The type can be ComputeResource, EMR, or a default value. The default value is EMR.
     * @param ResourceBaseType The type can be ComputeResource, EMR, or a default value. The default value is EMR.
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get Computing resource ID. 
     * @return ComputeResourceId Computing resource ID.
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set Computing resource ID.
     * @param ComputeResourceId Computing resource ID.
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    public DescribeNodeSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeSpecRequest(DescribeNodeSpecRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.CvmPayMode != null) {
            this.CvmPayMode = new Long(source.CvmPayMode);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "CvmPayMode", this.CvmPayMode);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);

    }
}

