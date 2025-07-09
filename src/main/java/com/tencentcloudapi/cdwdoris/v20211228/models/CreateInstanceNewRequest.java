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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceNewRequest extends AbstractModel {

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * FE specifications
    */
    @SerializedName("FeSpec")
    @Expose
    private CreateInstanceSpec FeSpec;

    /**
    * BE specifications.
    */
    @SerializedName("BeSpec")
    @Expose
    private CreateInstanceSpec BeSpec;

    /**
    * Whether it is highly available.
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * User VPCID
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * User subnet ID
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * Product version number
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * Payment type
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Database password
    */
    @SerializedName("DorisUserPwd")
    @Expose
    private String DorisUserPwd;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * High availability type:
0 indicates non-high availability (only one FE, FeSpec.CreateInstanceSpec.Count=1),
1 indicates read high availability (at least 3 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=3, and it must be an odd number),
2 indicates read and write high availability (at least 5 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=5, and it must be an odd number).
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * Whether to enable multi-availability zone.
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * After the Multi-AZ is enabled, all user's Availability Zones and Subnets information are shown.
    */
    @SerializedName("UserMultiZoneInfos")
    @Expose
    private NetworkInfo UserMultiZoneInfos;

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get FE specifications 
     * @return FeSpec FE specifications
     */
    public CreateInstanceSpec getFeSpec() {
        return this.FeSpec;
    }

    /**
     * Set FE specifications
     * @param FeSpec FE specifications
     */
    public void setFeSpec(CreateInstanceSpec FeSpec) {
        this.FeSpec = FeSpec;
    }

    /**
     * Get BE specifications. 
     * @return BeSpec BE specifications.
     */
    public CreateInstanceSpec getBeSpec() {
        return this.BeSpec;
    }

    /**
     * Set BE specifications.
     * @param BeSpec BE specifications.
     */
    public void setBeSpec(CreateInstanceSpec BeSpec) {
        this.BeSpec = BeSpec;
    }

    /**
     * Get Whether it is highly available. 
     * @return HaFlag Whether it is highly available.
     */
    public Boolean getHaFlag() {
        return this.HaFlag;
    }

    /**
     * Set Whether it is highly available.
     * @param HaFlag Whether it is highly available.
     */
    public void setHaFlag(Boolean HaFlag) {
        this.HaFlag = HaFlag;
    }

    /**
     * Get User VPCID 
     * @return UserVPCId User VPCID
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set User VPCID
     * @param UserVPCId User VPCID
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get User subnet ID 
     * @return UserSubnetId User subnet ID
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set User subnet ID
     * @param UserSubnetId User subnet ID
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get Product version number 
     * @return ProductVersion Product version number
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set Product version number
     * @param ProductVersion Product version number
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get Payment type 
     * @return ChargeProperties Payment type
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set Payment type
     * @param ChargeProperties Payment type
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Database password 
     * @return DorisUserPwd Database password
     */
    public String getDorisUserPwd() {
        return this.DorisUserPwd;
    }

    /**
     * Set Database password
     * @param DorisUserPwd Database password
     */
    public void setDorisUserPwd(String DorisUserPwd) {
        this.DorisUserPwd = DorisUserPwd;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get High availability type:
0 indicates non-high availability (only one FE, FeSpec.CreateInstanceSpec.Count=1),
1 indicates read high availability (at least 3 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=3, and it must be an odd number),
2 indicates read and write high availability (at least 5 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=5, and it must be an odd number). 
     * @return HaType High availability type:
0 indicates non-high availability (only one FE, FeSpec.CreateInstanceSpec.Count=1),
1 indicates read high availability (at least 3 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=3, and it must be an odd number),
2 indicates read and write high availability (at least 5 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=5, and it must be an odd number).
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set High availability type:
0 indicates non-high availability (only one FE, FeSpec.CreateInstanceSpec.Count=1),
1 indicates read high availability (at least 3 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=3, and it must be an odd number),
2 indicates read and write high availability (at least 5 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=5, and it must be an odd number).
     * @param HaType High availability type:
0 indicates non-high availability (only one FE, FeSpec.CreateInstanceSpec.Count=1),
1 indicates read high availability (at least 3 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=3, and it must be an odd number),
2 indicates read and write high availability (at least 5 FEs must be deployed, FeSpec.CreateInstanceSpec.Count>=5, and it must be an odd number).
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage. 
     * @return CaseSensitive Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
     * @param CaseSensitive Whether the table name is case sensitive, 0 refers to sensitive, 1 refers to insensitive, compared in lowercase; 2 refers to insensitive, and the table name is changed to lowercase for storage.
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Whether to enable multi-availability zone. 
     * @return EnableMultiZones Whether to enable multi-availability zone.
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set Whether to enable multi-availability zone.
     * @param EnableMultiZones Whether to enable multi-availability zone.
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get After the Multi-AZ is enabled, all user's Availability Zones and Subnets information are shown. 
     * @return UserMultiZoneInfos After the Multi-AZ is enabled, all user's Availability Zones and Subnets information are shown.
     */
    public NetworkInfo getUserMultiZoneInfos() {
        return this.UserMultiZoneInfos;
    }

    /**
     * Set After the Multi-AZ is enabled, all user's Availability Zones and Subnets information are shown.
     * @param UserMultiZoneInfos After the Multi-AZ is enabled, all user's Availability Zones and Subnets information are shown.
     */
    public void setUserMultiZoneInfos(NetworkInfo UserMultiZoneInfos) {
        this.UserMultiZoneInfos = UserMultiZoneInfos;
    }

    public CreateInstanceNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceNewRequest(CreateInstanceNewRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.FeSpec != null) {
            this.FeSpec = new CreateInstanceSpec(source.FeSpec);
        }
        if (source.BeSpec != null) {
            this.BeSpec = new CreateInstanceSpec(source.BeSpec);
        }
        if (source.HaFlag != null) {
            this.HaFlag = new Boolean(source.HaFlag);
        }
        if (source.UserVPCId != null) {
            this.UserVPCId = new String(source.UserVPCId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DorisUserPwd != null) {
            this.DorisUserPwd = new String(source.DorisUserPwd);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Long(source.CaseSensitive);
        }
        if (source.EnableMultiZones != null) {
            this.EnableMultiZones = new Boolean(source.EnableMultiZones);
        }
        if (source.UserMultiZoneInfos != null) {
            this.UserMultiZoneInfos = new NetworkInfo(source.UserMultiZoneInfos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "FeSpec.", this.FeSpec);
        this.setParamObj(map, prefix + "BeSpec.", this.BeSpec);
        this.setParamSimple(map, prefix + "HaFlag", this.HaFlag);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DorisUserPwd", this.DorisUserPwd);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HaType", this.HaType);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "EnableMultiZones", this.EnableMultiZones);
        this.setParamObj(map, prefix + "UserMultiZoneInfos.", this.UserMultiZoneInfos);

    }
}

