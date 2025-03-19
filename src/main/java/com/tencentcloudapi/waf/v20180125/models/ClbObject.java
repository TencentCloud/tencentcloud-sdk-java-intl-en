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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbObject extends AbstractModel {

    /**
    * Object ID
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Precise Domain List
    */
    @SerializedName("PreciseDomains")
    @Expose
    private String [] PreciseDomains;

    /**
    * WAF Feature Switch Status, 0 Off 1 On
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * WAF Log Switch Status, 0 Off 1 On
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * Virtual Domain Name Corresponding to CLB Object
    */
    @SerializedName("VirtualDomain")
    @Expose
    private String VirtualDomain;

    /**
    * Object name
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * Public network address
    */
    @SerializedName("PublicIp")
    @Expose
    private String [] PublicIp;

    /**
    * Private network address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String [] PrivateIp;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC ID
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * WAF instance level, if no instance is bound, it is 0
    */
    @SerializedName("InstanceLevel")
    @Expose
    private Long InstanceLevel;

    /**
    * CLB Shipping Switch
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * Kafka Shipping Switch
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * Object type: CLB: Load Balancer, TSE: Cloud-native Gateway

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Object Region

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Proxy status. 0: disabled; 1: Use the first IP address in XFF as the client IP address; 2: Use remote_addr as the client IP address; 3: Obtain the client IP address from the specified header field. The field is given by the IpHeaders field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * List of header fields for obtaining the client IP. This parameter is effective when IsCdn is 3.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * Bot protection switch
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * API protection switch
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * Object access mode. 0: image mode; 1: cleaning mode; 2: examination mode. By default, the cleaning mode is used.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectFlowMode")
    @Expose
    private Long ObjectFlowMode;

    /**
    * VPC ID in numerical format

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
     * Get Object ID 
     * @return ObjectId Object ID
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Object ID
     * @param ObjectId Object ID
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Precise Domain List 
     * @return PreciseDomains Precise Domain List
     */
    public String [] getPreciseDomains() {
        return this.PreciseDomains;
    }

    /**
     * Set Precise Domain List
     * @param PreciseDomains Precise Domain List
     */
    public void setPreciseDomains(String [] PreciseDomains) {
        this.PreciseDomains = PreciseDomains;
    }

    /**
     * Get WAF Feature Switch Status, 0 Off 1 On 
     * @return Status WAF Feature Switch Status, 0 Off 1 On
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set WAF Feature Switch Status, 0 Off 1 On
     * @param Status WAF Feature Switch Status, 0 Off 1 On
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get WAF Log Switch Status, 0 Off 1 On 
     * @return ClsStatus WAF Log Switch Status, 0 Off 1 On
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set WAF Log Switch Status, 0 Off 1 On
     * @param ClsStatus WAF Log Switch Status, 0 Off 1 On
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get Virtual Domain Name Corresponding to CLB Object 
     * @return VirtualDomain Virtual Domain Name Corresponding to CLB Object
     */
    public String getVirtualDomain() {
        return this.VirtualDomain;
    }

    /**
     * Set Virtual Domain Name Corresponding to CLB Object
     * @param VirtualDomain Virtual Domain Name Corresponding to CLB Object
     */
    public void setVirtualDomain(String VirtualDomain) {
        this.VirtualDomain = VirtualDomain;
    }

    /**
     * Get Object name 
     * @return ObjectName Object name
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set Object name
     * @param ObjectName Object name
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get Public network address 
     * @return PublicIp Public network address
     */
    public String [] getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public network address
     * @param PublicIp Public network address
     */
    public void setPublicIp(String [] PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private network address 
     * @return PrivateIp Private network address
     */
    public String [] getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private network address
     * @param PrivateIp Private network address
     */
    public void setPrivateIp(String [] PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC ID 
     * @return Vpc VPC ID
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC ID
     * @param Vpc VPC ID
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get WAF instance level, if no instance is bound, it is 0 
     * @return InstanceLevel WAF instance level, if no instance is bound, it is 0
     */
    public Long getInstanceLevel() {
        return this.InstanceLevel;
    }

    /**
     * Set WAF instance level, if no instance is bound, it is 0
     * @param InstanceLevel WAF instance level, if no instance is bound, it is 0
     */
    public void setInstanceLevel(Long InstanceLevel) {
        this.InstanceLevel = InstanceLevel;
    }

    /**
     * Get CLB Shipping Switch 
     * @return PostCLSStatus CLB Shipping Switch
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set CLB Shipping Switch
     * @param PostCLSStatus CLB Shipping Switch
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get Kafka Shipping Switch 
     * @return PostCKafkaStatus Kafka Shipping Switch
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set Kafka Shipping Switch
     * @param PostCKafkaStatus Kafka Shipping Switch
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get Object type: CLB: Load Balancer, TSE: Cloud-native Gateway

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Object type: CLB: Load Balancer, TSE: Cloud-native Gateway

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Object type: CLB: Load Balancer, TSE: Cloud-native Gateway

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Object type: CLB: Load Balancer, TSE: Cloud-native Gateway

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Object Region

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Object Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Object Region

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Object Region

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Proxy status. 0: disabled; 1: Use the first IP address in XFF as the client IP address; 2: Use remote_addr as the client IP address; 3: Obtain the client IP address from the specified header field. The field is given by the IpHeaders field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Proxy Proxy status. 0: disabled; 1: Use the first IP address in XFF as the client IP address; 2: Use remote_addr as the client IP address; 3: Obtain the client IP address from the specified header field. The field is given by the IpHeaders field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set Proxy status. 0: disabled; 1: Use the first IP address in XFF as the client IP address; 2: Use remote_addr as the client IP address; 3: Obtain the client IP address from the specified header field. The field is given by the IpHeaders field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Proxy Proxy status. 0: disabled; 1: Use the first IP address in XFF as the client IP address; 2: Use remote_addr as the client IP address; 3: Obtain the client IP address from the specified header field. The field is given by the IpHeaders field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get List of header fields for obtaining the client IP. This parameter is effective when IsCdn is 3.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpHeaders List of header fields for obtaining the client IP. This parameter is effective when IsCdn is 3.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set List of header fields for obtaining the client IP. This parameter is effective when IsCdn is 3.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpHeaders List of header fields for obtaining the client IP. This parameter is effective when IsCdn is 3.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get Bot protection switch
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotStatus Bot protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set Bot protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotStatus Bot protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get API protection switch
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiStatus API protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set API protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiStatus API protection switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get Object access mode. 0: image mode; 1: cleaning mode; 2: examination mode. By default, the cleaning mode is used.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectFlowMode Object access mode. 0: image mode; 1: cleaning mode; 2: examination mode. By default, the cleaning mode is used.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getObjectFlowMode() {
        return this.ObjectFlowMode;
    }

    /**
     * Set Object access mode. 0: image mode; 1: cleaning mode; 2: examination mode. By default, the cleaning mode is used.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectFlowMode Object access mode. 0: image mode; 1: cleaning mode; 2: examination mode. By default, the cleaning mode is used.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectFlowMode(Long ObjectFlowMode) {
        this.ObjectFlowMode = ObjectFlowMode;
    }

    /**
     * Get VPC ID in numerical format

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumericalVpcId VPC ID in numerical format

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPC ID in numerical format

Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumericalVpcId VPC ID in numerical format

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    public ClbObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbObject(ClbObject source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PreciseDomains != null) {
            this.PreciseDomains = new String[source.PreciseDomains.length];
            for (int i = 0; i < source.PreciseDomains.length; i++) {
                this.PreciseDomains[i] = new String(source.PreciseDomains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.VirtualDomain != null) {
            this.VirtualDomain = new String(source.VirtualDomain);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String[source.PublicIp.length];
            for (int i = 0; i < source.PublicIp.length; i++) {
                this.PublicIp[i] = new String(source.PublicIp[i]);
            }
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String[source.PrivateIp.length];
            for (int i = 0; i < source.PrivateIp.length; i++) {
                this.PrivateIp[i] = new String(source.PrivateIp[i]);
            }
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.InstanceLevel != null) {
            this.InstanceLevel = new Long(source.InstanceLevel);
        }
        if (source.PostCLSStatus != null) {
            this.PostCLSStatus = new Long(source.PostCLSStatus);
        }
        if (source.PostCKafkaStatus != null) {
            this.PostCKafkaStatus = new Long(source.PostCKafkaStatus);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Proxy != null) {
            this.Proxy = new Long(source.Proxy);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.ObjectFlowMode != null) {
            this.ObjectFlowMode = new Long(source.ObjectFlowMode);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "PreciseDomains.", this.PreciseDomains);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "VirtualDomain", this.VirtualDomain);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamArraySimple(map, prefix + "PublicIp.", this.PublicIp);
        this.setParamArraySimple(map, prefix + "PrivateIp.", this.PrivateIp);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "InstanceLevel", this.InstanceLevel);
        this.setParamSimple(map, prefix + "PostCLSStatus", this.PostCLSStatus);
        this.setParamSimple(map, prefix + "PostCKafkaStatus", this.PostCKafkaStatus);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "ObjectFlowMode", this.ObjectFlowMode);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);

    }
}

