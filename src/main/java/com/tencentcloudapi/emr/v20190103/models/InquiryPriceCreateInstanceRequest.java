/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class InquiryPriceCreateInstanceRequest extends AbstractModel {

    /**
    * Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Whether to enable high availability of node. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * List of deployed components. Different required components need to be selected for different EMR product IDs (i.e., `ProductId`; for specific meanings, please see the `ProductId` field in the input parameter):
<li>When `ProductId` is 1, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 2, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 4, the required components include hadoop-2.8.4, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 7, the required components include hadoop-3.1.2, knox-1.2.0, and zookeeper-3.4.9</li>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * Node specification queried for price.
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * EMR-MetaDB instance
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * Custom MetaDB instance information
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1.</li>
<li>2: EMR v2.0.1.</li>
<li>4: EMR v2.1.0.</li>
<li>7: EMR v3.0.0.</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * Shared component information
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * 
    */
    @SerializedName("VersionID")
    @Expose
    private Long VersionID;

    /**
    * AZ specs
    */
    @SerializedName("MultiZoneSettings")
    @Expose
    private MultiZoneSetting [] MultiZoneSettings;

    /**
     * Get Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li> 
     * @return TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     * @param TimeUnit Time unit of instance purchase duration. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li> 
     * @return TimeSpan Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     * @param TimeSpan Purchase duration of instance, which needs to be used together with `TimeUnit`.
<li>When `TimeUnit` is `s`, this parameter can only be filled with 3600, indicating a pay-as-you-go instance.</li>
<li>When `TimeUnit` is `m`, the number entered in this parameter indicates the purchase duration of the monthly-subscription instance; for example, 1 means one month</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Currency. 
     * @return Currency Currency.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency.
     * @param Currency Currency.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li> 
     * @return PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     * @param PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether to enable high availability of node. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li> 
     * @return SupportHA Whether to enable high availability of node. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set Whether to enable high availability of node. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     * @param SupportHA Whether to enable high availability of node. Valid values:
<li>0: does not enable high availability of node.</li>
<li>1: enables high availability of node.</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get List of deployed components. Different required components need to be selected for different EMR product IDs (i.e., `ProductId`; for specific meanings, please see the `ProductId` field in the input parameter):
<li>When `ProductId` is 1, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 2, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 4, the required components include hadoop-2.8.4, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 7, the required components include hadoop-3.1.2, knox-1.2.0, and zookeeper-3.4.9</li> 
     * @return Software List of deployed components. Different required components need to be selected for different EMR product IDs (i.e., `ProductId`; for specific meanings, please see the `ProductId` field in the input parameter):
<li>When `ProductId` is 1, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 2, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 4, the required components include hadoop-2.8.4, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 7, the required components include hadoop-3.1.2, knox-1.2.0, and zookeeper-3.4.9</li>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set List of deployed components. Different required components need to be selected for different EMR product IDs (i.e., `ProductId`; for specific meanings, please see the `ProductId` field in the input parameter):
<li>When `ProductId` is 1, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 2, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 4, the required components include hadoop-2.8.4, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 7, the required components include hadoop-3.1.2, knox-1.2.0, and zookeeper-3.4.9</li>
     * @param Software List of deployed components. Different required components need to be selected for different EMR product IDs (i.e., `ProductId`; for specific meanings, please see the `ProductId` field in the input parameter):
<li>When `ProductId` is 1, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 2, the required components include hadoop-2.7.3, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 4, the required components include hadoop-2.8.4, knox-1.2.0, and zookeeper-3.4.9</li>
<li>When `ProductId` is 7, the required components include hadoop-3.1.2, knox-1.2.0, and zookeeper-3.4.9</li>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get Node specification queried for price. 
     * @return ResourceSpec Node specification queried for price.
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set Node specification queried for price.
     * @param ResourceSpec Node specification queried for price.
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance. 
     * @return Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     * @param Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc. 
     * @return VPCSettings Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     * @param VPCSettings Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc.
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li> 
     * @return MetaType Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     * @param MetaType Hive-shared metadatabase type. Valid values:
<li>EMR_DEFAULT_META: the cluster creates one by default.</li>
<li>EMR_EXIST_META: the cluster uses the specified EMR-MetaDB instance.</li>
<li>USER_CUSTOM_META: the cluster uses a custom MetaDB instance.</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get EMR-MetaDB instance 
     * @return UnifyMetaInstanceId EMR-MetaDB instance
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set EMR-MetaDB instance
     * @param UnifyMetaInstanceId EMR-MetaDB instance
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get Custom MetaDB instance information 
     * @return MetaDBInfo Custom MetaDB instance information
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set Custom MetaDB instance information
     * @param MetaDBInfo Custom MetaDB instance information
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1.</li>
<li>2: EMR v2.0.1.</li>
<li>4: EMR v2.1.0.</li>
<li>7: EMR v3.0.0.</li> 
     * @return ProductId Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1.</li>
<li>2: EMR v2.0.1.</li>
<li>4: EMR v2.1.0.</li>
<li>7: EMR v3.0.0.</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1.</li>
<li>2: EMR v2.0.1.</li>
<li>4: EMR v2.1.0.</li>
<li>7: EMR v3.0.0.</li>
     * @param ProductId Product ID. Different product IDs represent different EMR product versions. Valid values:
<li>1: EMR v1.3.1.</li>
<li>2: EMR v2.0.1.</li>
<li>4: EMR v2.1.0.</li>
<li>7: EMR v3.0.0.</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase 
     * @return SceneName Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     * @param SceneName Scenario-based values:
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get Shared component information 
     * @return ExternalService Shared component information
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set Shared component information
     * @param ExternalService Shared component information
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get  
     * @return VersionID 
     */
    public Long getVersionID() {
        return this.VersionID;
    }

    /**
     * Set 
     * @param VersionID 
     */
    public void setVersionID(Long VersionID) {
        this.VersionID = VersionID;
    }

    /**
     * Get AZ specs 
     * @return MultiZoneSettings AZ specs
     */
    public MultiZoneSetting [] getMultiZoneSettings() {
        return this.MultiZoneSettings;
    }

    /**
     * Set AZ specs
     * @param MultiZoneSettings AZ specs
     */
    public void setMultiZoneSettings(MultiZoneSetting [] MultiZoneSettings) {
        this.MultiZoneSettings = MultiZoneSettings;
    }

    public InquiryPriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceRequest(InquiryPriceCreateInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.VersionID != null) {
            this.VersionID = new Long(source.VersionID);
        }
        if (source.MultiZoneSettings != null) {
            this.MultiZoneSettings = new MultiZoneSetting[source.MultiZoneSettings.length];
            for (int i = 0; i < source.MultiZoneSettings.length; i++) {
                this.MultiZoneSettings[i] = new MultiZoneSetting(source.MultiZoneSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "VersionID", this.VersionID);
        this.setParamArrayObj(map, prefix + "MultiZoneSettings.", this.MultiZoneSettings);

    }
}

