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
    * <p>AZ ID. For more information, see https://document.capi.woa.com/document/api/1605/76892.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>0: pay-as-you-go; 1: yearly/monthly subscription; 99: pay-as-you-go and yearly/monthly subscription. Incorrect values will not display billing information.</p>
    */
    @SerializedName("CvmPayMode")
    @Expose
    private Long CvmPayMode;

    /**
    * <p>Node type. Valid values: Master, Core, Task, Router, and All.</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>0: old billing page; 1: new billing page. If incorrectly filled, the old billing page is used by default.</p>
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * <p>Product ID. If not specified, the value is 0, indicating all product IDs. This parameter is required on the frontend.</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>Scenario name.</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>Computing resource ID.</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
     * Get <p>AZ ID. For more information, see https://document.capi.woa.com/document/api/1605/76892.</p> 
     * @return ZoneId <p>AZ ID. For more information, see https://document.capi.woa.com/document/api/1605/76892.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>AZ ID. For more information, see https://document.capi.woa.com/document/api/1605/76892.</p>
     * @param ZoneId <p>AZ ID. For more information, see https://document.capi.woa.com/document/api/1605/76892.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>0: pay-as-you-go; 1: yearly/monthly subscription; 99: pay-as-you-go and yearly/monthly subscription. Incorrect values will not display billing information.</p> 
     * @return CvmPayMode <p>0: pay-as-you-go; 1: yearly/monthly subscription; 99: pay-as-you-go and yearly/monthly subscription. Incorrect values will not display billing information.</p>
     */
    public Long getCvmPayMode() {
        return this.CvmPayMode;
    }

    /**
     * Set <p>0: pay-as-you-go; 1: yearly/monthly subscription; 99: pay-as-you-go and yearly/monthly subscription. Incorrect values will not display billing information.</p>
     * @param CvmPayMode <p>0: pay-as-you-go; 1: yearly/monthly subscription; 99: pay-as-you-go and yearly/monthly subscription. Incorrect values will not display billing information.</p>
     */
    public void setCvmPayMode(Long CvmPayMode) {
        this.CvmPayMode = CvmPayMode;
    }

    /**
     * Get <p>Node type. Valid values: Master, Core, Task, Router, and All.</p> 
     * @return NodeType <p>Node type. Valid values: Master, Core, Task, Router, and All.</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type. Valid values: Master, Core, Task, Router, and All.</p>
     * @param NodeType <p>Node type. Valid values: Master, Core, Task, Router, and All.</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>0: old billing page; 1: new billing page. If incorrectly filled, the old billing page is used by default.</p> 
     * @return TradeType <p>0: old billing page; 1: new billing page. If incorrectly filled, the old billing page is used by default.</p>
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set <p>0: old billing page; 1: new billing page. If incorrectly filled, the old billing page is used by default.</p>
     * @param TradeType <p>0: old billing page; 1: new billing page. If incorrectly filled, the old billing page is used by default.</p>
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get <p>Product ID. If not specified, the value is 0, indicating all product IDs. This parameter is required on the frontend.</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p> 
     * @return ProductId <p>Product ID. If not specified, the value is 0, indicating all product IDs. This parameter is required on the frontend.</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>Product ID. If not specified, the value is 0, indicating all product IDs. This parameter is required on the frontend.</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     * @param ProductId <p>Product ID. If not specified, the value is 0, indicating all product IDs. This parameter is required on the frontend.</p><p>44    EMR    V3.5.0<br>43    EMR    V3.4.0.tlinux<br>42    EMR    V2.7.0.tlinux<br>41    DRUID    V1.1.0<br>67    STARROCKS    V2.2.0<br>45    DRUID    V1.1.0.tlinux<br>40    EMRCLOUD    v3.2.0<br>47    EMR    V4.0.0<br>48    STARROCKS    V1.2.0<br>49    STARROCKS    V1.3.0<br>50    KAFKA    V2.0.0<br>51    STARROCKS    V1.4.0<br>52    EMR-TKE    V1.0.0<br>53    EMR    V3.6.0<br>54    STARROCKS    V2.0.0<br>55    EMR-TKE    V1.0.1<br>56    EMR-TKE    DLCV1.0.0<br>57    EMR    V2.8.0<br>58    EMR    V3.6.1<br>59    SERVERLESS    V1.0.0<br>60    EMR-TKE    V1.1.0<br>62    STARROCKS    V2.1.1<br>63    STARROCKS    V2.1.1.tlinux<br>64    EMR-TKE    TCCV1.0.0<br>65    EMR-TKE-AI    V1.0.0<br>66    RSS    V1.0.0<br>24    EMR    TianQiong-V1.0.0<br>3    EMR    V2.0.1.tlinux<br>4    EMR    V2.1.0<br>7    EMR    V3.0.0<br>8    EMR    V3.0.0.tlinux<br>9    EMR    V2.2.0<br>11    CLICKHOUSE    V1.0.0<br>12    CLICKHOUSE    V1.0.0.tlinux<br>16    EMR    V2.3.0<br>17    CLICKHOUSE    V1.1.0<br>18    CLICKHOUSE    V1.1.0.tlinux<br>19    EMR    V2.4.0<br>20    EMR    V2.5.0<br>21    USERCUSTOM    V1.0.0<br>22    CLICKHOUSE    V1.2.0<br>39    STARROCKS    V1.1.0<br>25    EMR    V3.1.0<br>26    DORIS    V1.0.0<br>27    KAFKA    V1.0.0<br>28    EMR    V3.2.0<br>29    EMR    V2.5.1<br>30    EMR    V2.6.0<br>32    DORIS    V1.1.0<br>33    EMR    V3.2.1<br>34    EMR    V3.3.0<br>35    DORIS    V1.2.0<br>36    STARROCKS    V1.0.0<br>37    EMR    V3.4.0<br>38    EMR    V2.7.0</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>Scenario name.</p> 
     * @return SceneName <p>Scenario name.</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>Scenario name.</p>
     * @param SceneName <p>Scenario name.</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p> 
     * @return ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     * @param ResourceBaseType <p>The type can be ComputeResource, EMR, or a default value. The default value is EMR.</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>Computing resource ID.</p> 
     * @return ComputeResourceId <p>Computing resource ID.</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>Computing resource ID.</p>
     * @param ComputeResourceId <p>Computing resource ID.</p>
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

