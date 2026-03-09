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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRegisterCodeRequest extends AbstractModel {

    /**
    * Describes the registration code. maximum length is 128 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Prefix of the registered instance name. maximum length is 32 characters.
    */
    @SerializedName("InstanceNamePrefix")
    @Expose
    private String InstanceNamePrefix;

    /**
    * Number of instances allowed by the registration code. default value is 10, minimum value is 1, maximum value is 10000.
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * The validity time of the registration code is measured in hours. default value is 4.

-If the input value is less than or equal to 99999, the time is deemed valid in hours.
-If the input value is more than 99999, it is set to permanently valid.
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * Restrict the registration code to register only from the public outbound ip described by IpAddressRange.

Empty by default, meaning no restrictions.

The value should be in standard IPv4 or CIDRv4 format, such as 192.168.1.1 or 192.168.0.0/16.
    */
    @SerializedName("IpAddressRange")
    @Expose
    private String IpAddressRange;

    /**
     * Get Describes the registration code. maximum length is 128 characters. 
     * @return Description Describes the registration code. maximum length is 128 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the registration code. maximum length is 128 characters.
     * @param Description Describes the registration code. maximum length is 128 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Prefix of the registered instance name. maximum length is 32 characters. 
     * @return InstanceNamePrefix Prefix of the registered instance name. maximum length is 32 characters.
     */
    public String getInstanceNamePrefix() {
        return this.InstanceNamePrefix;
    }

    /**
     * Set Prefix of the registered instance name. maximum length is 32 characters.
     * @param InstanceNamePrefix Prefix of the registered instance name. maximum length is 32 characters.
     */
    public void setInstanceNamePrefix(String InstanceNamePrefix) {
        this.InstanceNamePrefix = InstanceNamePrefix;
    }

    /**
     * Get Number of instances allowed by the registration code. default value is 10, minimum value is 1, maximum value is 10000. 
     * @return RegisterLimit Number of instances allowed by the registration code. default value is 10, minimum value is 1, maximum value is 10000.
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set Number of instances allowed by the registration code. default value is 10, minimum value is 1, maximum value is 10000.
     * @param RegisterLimit Number of instances allowed by the registration code. default value is 10, minimum value is 1, maximum value is 10000.
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get The validity time of the registration code is measured in hours. default value is 4.

-If the input value is less than or equal to 99999, the time is deemed valid in hours.
-If the input value is more than 99999, it is set to permanently valid. 
     * @return EffectiveTime The validity time of the registration code is measured in hours. default value is 4.

-If the input value is less than or equal to 99999, the time is deemed valid in hours.
-If the input value is more than 99999, it is set to permanently valid.
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set The validity time of the registration code is measured in hours. default value is 4.

-If the input value is less than or equal to 99999, the time is deemed valid in hours.
-If the input value is more than 99999, it is set to permanently valid.
     * @param EffectiveTime The validity time of the registration code is measured in hours. default value is 4.

-If the input value is less than or equal to 99999, the time is deemed valid in hours.
-If the input value is more than 99999, it is set to permanently valid.
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get Restrict the registration code to register only from the public outbound ip described by IpAddressRange.

Empty by default, meaning no restrictions.

The value should be in standard IPv4 or CIDRv4 format, such as 192.168.1.1 or 192.168.0.0/16. 
     * @return IpAddressRange Restrict the registration code to register only from the public outbound ip described by IpAddressRange.

Empty by default, meaning no restrictions.

The value should be in standard IPv4 or CIDRv4 format, such as 192.168.1.1 or 192.168.0.0/16.
     */
    public String getIpAddressRange() {
        return this.IpAddressRange;
    }

    /**
     * Set Restrict the registration code to register only from the public outbound ip described by IpAddressRange.

Empty by default, meaning no restrictions.

The value should be in standard IPv4 or CIDRv4 format, such as 192.168.1.1 or 192.168.0.0/16.
     * @param IpAddressRange Restrict the registration code to register only from the public outbound ip described by IpAddressRange.

Empty by default, meaning no restrictions.

The value should be in standard IPv4 or CIDRv4 format, such as 192.168.1.1 or 192.168.0.0/16.
     */
    public void setIpAddressRange(String IpAddressRange) {
        this.IpAddressRange = IpAddressRange;
    }

    public CreateRegisterCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRegisterCodeRequest(CreateRegisterCodeRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceNamePrefix != null) {
            this.InstanceNamePrefix = new String(source.InstanceNamePrefix);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new Long(source.EffectiveTime);
        }
        if (source.IpAddressRange != null) {
            this.IpAddressRange = new String(source.IpAddressRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceNamePrefix", this.InstanceNamePrefix);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "IpAddressRange", this.IpAddressRange);

    }
}

