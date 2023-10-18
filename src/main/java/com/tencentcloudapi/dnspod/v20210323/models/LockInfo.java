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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LockInfo extends AbstractModel {

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Domain unlock code
    */
    @SerializedName("LockCode")
    @Expose
    private String LockCode;

    /**
    * Automatic unlock date of the domain
    */
    @SerializedName("LockEnd")
    @Expose
    private String LockEnd;

    /**
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Domain unlock code 
     * @return LockCode Domain unlock code
     */
    public String getLockCode() {
        return this.LockCode;
    }

    /**
     * Set Domain unlock code
     * @param LockCode Domain unlock code
     */
    public void setLockCode(String LockCode) {
        this.LockCode = LockCode;
    }

    /**
     * Get Automatic unlock date of the domain 
     * @return LockEnd Automatic unlock date of the domain
     */
    public String getLockEnd() {
        return this.LockEnd;
    }

    /**
     * Set Automatic unlock date of the domain
     * @param LockEnd Automatic unlock date of the domain
     */
    public void setLockEnd(String LockEnd) {
        this.LockEnd = LockEnd;
    }

    public LockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LockInfo(LockInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.LockCode != null) {
            this.LockCode = new String(source.LockCode);
        }
        if (source.LockEnd != null) {
            this.LockEnd = new String(source.LockEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "LockCode", this.LockCode);
        this.setParamSimple(map, prefix + "LockEnd", this.LockEnd);

    }
}

