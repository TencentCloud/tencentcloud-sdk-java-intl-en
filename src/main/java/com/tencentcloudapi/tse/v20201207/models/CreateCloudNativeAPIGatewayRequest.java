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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayRequest extends AbstractModel {

    /**
    * Cloud native API gateway name supports up to 60 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cloud native API gateway type, currently only support kong.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cloud Native API gateway version. Reference value:
- 2.4.1
- 2.5.1
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * Cloud Native API gateway node configuration.
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * Cloud native API gateway vpc configuration.
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * Cloud native API gateway description supports up to 120 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * Whether CLS log is enabled. Default value: false.
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * Product version. Reference value:
-TRIAL: Development edition
-STANDARD: Standard version (default value)
-PROFESSIONAL: Pro Edition
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * Public network outbound traffic bandwidth, [1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Actual region information of the instance. Default value: ap-guangzhou.
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * ingress Class name
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * Payment type. Reference value:
0: Postpaid (default value)
1: Prepayment (The API does not currently support creating prepaid instances)
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * Public network configuration
    */
    @SerializedName("InternetConfig")
    @Expose
    private InternetConfig InternetConfig;

    /**
    * Associated prometheus ID
    */
    @SerializedName("PromId")
    @Expose
    private String PromId;

    /**
     * Get Cloud native API gateway name supports up to 60 characters. 
     * @return Name Cloud native API gateway name supports up to 60 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cloud native API gateway name supports up to 60 characters.
     * @param Name Cloud native API gateway name supports up to 60 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cloud native API gateway type, currently only support kong. 
     * @return Type Cloud native API gateway type, currently only support kong.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Cloud native API gateway type, currently only support kong.
     * @param Type Cloud native API gateway type, currently only support kong.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cloud Native API gateway version. Reference value:
- 2.4.1
- 2.5.1 
     * @return GatewayVersion Cloud Native API gateway version. Reference value:
- 2.4.1
- 2.5.1
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set Cloud Native API gateway version. Reference value:
- 2.4.1
- 2.5.1
     * @param GatewayVersion Cloud Native API gateway version. Reference value:
- 2.4.1
- 2.5.1
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get Cloud Native API gateway node configuration. 
     * @return NodeConfig Cloud Native API gateway node configuration.
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Cloud Native API gateway node configuration.
     * @param NodeConfig Cloud Native API gateway node configuration.
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Cloud native API gateway vpc configuration. 
     * @return VpcConfig Cloud native API gateway vpc configuration.
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set Cloud native API gateway vpc configuration.
     * @param VpcConfig Cloud native API gateway vpc configuration.
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get Cloud native API gateway description supports up to 120 characters. 
     * @return Description Cloud native API gateway description supports up to 120 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Cloud native API gateway description supports up to 120 characters.
     * @param Description Cloud native API gateway description supports up to 120 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether CLS log is enabled. Default value: false. 
     * @return EnableCls Whether CLS log is enabled. Default value: false.
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set Whether CLS log is enabled. Default value: false.
     * @param EnableCls Whether CLS log is enabled. Default value: false.
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get Product version. Reference value:
-TRIAL: Development edition
-STANDARD: Standard version (default value)
-PROFESSIONAL: Pro Edition 
     * @return FeatureVersion Product version. Reference value:
-TRIAL: Development edition
-STANDARD: Standard version (default value)
-PROFESSIONAL: Pro Edition
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set Product version. Reference value:
-TRIAL: Development edition
-STANDARD: Standard version (default value)
-PROFESSIONAL: Pro Edition
     * @param FeatureVersion Product version. Reference value:
-TRIAL: Development edition
-STANDARD: Standard version (default value)
-PROFESSIONAL: Pro Edition
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get Public network outbound traffic bandwidth, [1,2048]Mbps 
     * @return InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network outbound traffic bandwidth, [1,2048]Mbps
     * @param InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Actual region information of the instance. Default value: ap-guangzhou. 
     * @return EngineRegion Actual region information of the instance. Default value: ap-guangzhou.
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set Actual region information of the instance. Default value: ap-guangzhou.
     * @param EngineRegion Actual region information of the instance. Default value: ap-guangzhou.
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get ingress Class name 
     * @return IngressClassName ingress Class name
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set ingress Class name
     * @param IngressClassName ingress Class name
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get Payment type. Reference value:
0: Postpaid (default value)
1: Prepayment (The API does not currently support creating prepaid instances) 
     * @return TradeType Payment type. Reference value:
0: Postpaid (default value)
1: Prepayment (The API does not currently support creating prepaid instances)
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set Payment type. Reference value:
0: Postpaid (default value)
1: Prepayment (The API does not currently support creating prepaid instances)
     * @param TradeType Payment type. Reference value:
0: Postpaid (default value)
1: Prepayment (The API does not currently support creating prepaid instances)
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get Public network configuration 
     * @return InternetConfig Public network configuration
     */
    public InternetConfig getInternetConfig() {
        return this.InternetConfig;
    }

    /**
     * Set Public network configuration
     * @param InternetConfig Public network configuration
     */
    public void setInternetConfig(InternetConfig InternetConfig) {
        this.InternetConfig = InternetConfig;
    }

    /**
     * Get Associated prometheus ID 
     * @return PromId Associated prometheus ID
     */
    public String getPromId() {
        return this.PromId;
    }

    /**
     * Set Associated prometheus ID
     * @param PromId Associated prometheus ID
     */
    public void setPromId(String PromId) {
        this.PromId = PromId;
    }

    public CreateCloudNativeAPIGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayRequest(CreateCloudNativeAPIGatewayRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new CloudNativeAPIGatewayVpcConfig(source.VpcConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new InstanceTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new InstanceTagInfo(source.Tags[i]);
            }
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.FeatureVersion != null) {
            this.FeatureVersion = new String(source.FeatureVersion);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.IngressClassName != null) {
            this.IngressClassName = new String(source.IngressClassName);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.InternetConfig != null) {
            this.InternetConfig = new InternetConfig(source.InternetConfig);
        }
        if (source.PromId != null) {
            this.PromId = new String(source.PromId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "FeatureVersion", this.FeatureVersion);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "IngressClassName", this.IngressClassName);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamObj(map, prefix + "InternetConfig.", this.InternetConfig);
        this.setParamSimple(map, prefix + "PromId", this.PromId);

    }
}

