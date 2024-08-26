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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * Availability zone name, such as ap-guangzhou-1
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Availability zone description, such as Guangzhou region 1
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Unique tag of the availability zone
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Encryptid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
     * Get Availability zone name, such as ap-guangzhou-1 
     * @return Name Availability zone name, such as ap-guangzhou-1
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Availability zone name, such as ap-guangzhou-1
     * @param Name Availability zone name, such as ap-guangzhou-1
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Availability zone description, such as Guangzhou region 1 
     * @return Desc Availability zone description, such as Guangzhou region 1
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Availability zone description, such as Guangzhou region 1
     * @param Desc Availability zone description, such as Guangzhou region 1
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Unique tag of the availability zone 
     * @return ZoneId Unique tag of the availability zone
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Unique tag of the availability zone
     * @param ZoneId Unique tag of the availability zone
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Encryptid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Encrypt Encryptid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Encryptid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Encrypt Encryptid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);

    }
}

