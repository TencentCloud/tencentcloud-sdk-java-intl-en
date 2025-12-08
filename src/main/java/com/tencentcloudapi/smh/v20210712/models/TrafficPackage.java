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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel {

    /**
    * Specifies the instance ID offset by the traffic package.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Source type of the traffic package. valid values: 0 (purchase), 1 (complimentary).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Total traffic in Bytes. since the number type has precision limitations, this field is a String type.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Total traffic in GB.
    */
    @SerializedName("SizeGB")
    @Expose
    private Long SizeGB;

    /**
    * Remaining traffic in Bytes. this field is of String type due to precision limitations of numeric data types.
    */
    @SerializedName("Remain")
    @Expose
    private String Remain;

    /**
    * Used traffic in Bytes. since the number type has precision limitations, this field is a String type.
    */
    @SerializedName("Used")
    @Expose
    private String Used;

    /**
    * Usage percentage. since the String type is used due to precision limitations of the number type, this field is of String type.
    */
    @SerializedName("UsedPercentage")
    @Expose
    private String UsedPercentage;

    /**
    * Effective time, the order time of the traffic package.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * Expiration time, which is the expiration time of the offset instance. if the traffic package offsets a pay-as-you-go or permanently valid instance, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Specifies the instance ID offset by the traffic package. 
     * @return InstanceId Specifies the instance ID offset by the traffic package.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID offset by the traffic package.
     * @param InstanceId Specifies the instance ID offset by the traffic package.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Dedicated domain name. if the instance has no dedicated domain name, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Source type of the traffic package. valid values: 0 (purchase), 1 (complimentary). 
     * @return Type Source type of the traffic package. valid values: 0 (purchase), 1 (complimentary).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Source type of the traffic package. valid values: 0 (purchase), 1 (complimentary).
     * @param Type Source type of the traffic package. valid values: 0 (purchase), 1 (complimentary).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Total traffic in Bytes. since the number type has precision limitations, this field is a String type. 
     * @return Size Total traffic in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Total traffic in Bytes. since the number type has precision limitations, this field is a String type.
     * @param Size Total traffic in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Total traffic in GB. 
     * @return SizeGB Total traffic in GB.
     */
    public Long getSizeGB() {
        return this.SizeGB;
    }

    /**
     * Set Total traffic in GB.
     * @param SizeGB Total traffic in GB.
     */
    public void setSizeGB(Long SizeGB) {
        this.SizeGB = SizeGB;
    }

    /**
     * Get Remaining traffic in Bytes. this field is of String type due to precision limitations of numeric data types. 
     * @return Remain Remaining traffic in Bytes. this field is of String type due to precision limitations of numeric data types.
     */
    public String getRemain() {
        return this.Remain;
    }

    /**
     * Set Remaining traffic in Bytes. this field is of String type due to precision limitations of numeric data types.
     * @param Remain Remaining traffic in Bytes. this field is of String type due to precision limitations of numeric data types.
     */
    public void setRemain(String Remain) {
        this.Remain = Remain;
    }

    /**
     * Get Used traffic in Bytes. since the number type has precision limitations, this field is a String type. 
     * @return Used Used traffic in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public String getUsed() {
        return this.Used;
    }

    /**
     * Set Used traffic in Bytes. since the number type has precision limitations, this field is a String type.
     * @param Used Used traffic in Bytes. since the number type has precision limitations, this field is a String type.
     */
    public void setUsed(String Used) {
        this.Used = Used;
    }

    /**
     * Get Usage percentage. since the String type is used due to precision limitations of the number type, this field is of String type. 
     * @return UsedPercentage Usage percentage. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public String getUsedPercentage() {
        return this.UsedPercentage;
    }

    /**
     * Set Usage percentage. since the String type is used due to precision limitations of the number type, this field is of String type.
     * @param UsedPercentage Usage percentage. since the String type is used due to precision limitations of the number type, this field is of String type.
     */
    public void setUsedPercentage(String UsedPercentage) {
        this.UsedPercentage = UsedPercentage;
    }

    /**
     * Get Effective time, the order time of the traffic package. 
     * @return EffectiveTime Effective time, the order time of the traffic package.
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Effective time, the order time of the traffic package.
     * @param EffectiveTime Effective time, the order time of the traffic package.
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Expiration time, which is the expiration time of the offset instance. if the traffic package offsets a pay-as-you-go or permanently valid instance, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time, which is the expiration time of the offset instance. if the traffic package offsets a pay-as-you-go or permanently valid instance, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time, which is the expiration time of the offset instance. if the traffic package offsets a pay-as-you-go or permanently valid instance, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time, which is the expiration time of the offset instance. if the traffic package offsets a pay-as-you-go or permanently valid instance, this attribute is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.SizeGB != null) {
            this.SizeGB = new Long(source.SizeGB);
        }
        if (source.Remain != null) {
            this.Remain = new String(source.Remain);
        }
        if (source.Used != null) {
            this.Used = new String(source.Used);
        }
        if (source.UsedPercentage != null) {
            this.UsedPercentage = new String(source.UsedPercentage);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeGB", this.SizeGB);
        this.setParamSimple(map, prefix + "Remain", this.Remain);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "UsedPercentage", this.UsedPercentage);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

