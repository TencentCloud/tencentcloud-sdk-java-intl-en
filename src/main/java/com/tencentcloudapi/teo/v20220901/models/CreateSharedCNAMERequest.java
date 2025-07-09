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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSharedCNAMERequest extends AbstractModel {

    /**
    * ID of the site to which the shared CNAME belongs.	
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Shared CNAME prefix. Enter a valid domain name prefix, such as "test-api" and "test-api.com". A maximum of 50 characters are allowed. 

Complete format of the shared CNAME: '<Custom prefix>+<A 12-character random string in ZoneId>+share.dnse[0-5].com'. 

For example, if the prefix is example.com, EdgeOne will create the shared CNAME: example.com.sai2ig51kaa5.share.dnse2.com.
    */
    @SerializedName("SharedCNAMEPrefix")
    @Expose
    private String SharedCNAMEPrefix;

    /**
    * Description. It supports 1-50 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get ID of the site to which the shared CNAME belongs.	 
     * @return ZoneId ID of the site to which the shared CNAME belongs.	
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site to which the shared CNAME belongs.	
     * @param ZoneId ID of the site to which the shared CNAME belongs.	
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Shared CNAME prefix. Enter a valid domain name prefix, such as "test-api" and "test-api.com". A maximum of 50 characters are allowed. 

Complete format of the shared CNAME: '<Custom prefix>+<A 12-character random string in ZoneId>+share.dnse[0-5].com'. 

For example, if the prefix is example.com, EdgeOne will create the shared CNAME: example.com.sai2ig51kaa5.share.dnse2.com. 
     * @return SharedCNAMEPrefix Shared CNAME prefix. Enter a valid domain name prefix, such as "test-api" and "test-api.com". A maximum of 50 characters are allowed. 

Complete format of the shared CNAME: '<Custom prefix>+<A 12-character random string in ZoneId>+share.dnse[0-5].com'. 

For example, if the prefix is example.com, EdgeOne will create the shared CNAME: example.com.sai2ig51kaa5.share.dnse2.com.
     */
    public String getSharedCNAMEPrefix() {
        return this.SharedCNAMEPrefix;
    }

    /**
     * Set Shared CNAME prefix. Enter a valid domain name prefix, such as "test-api" and "test-api.com". A maximum of 50 characters are allowed. 

Complete format of the shared CNAME: '<Custom prefix>+<A 12-character random string in ZoneId>+share.dnse[0-5].com'. 

For example, if the prefix is example.com, EdgeOne will create the shared CNAME: example.com.sai2ig51kaa5.share.dnse2.com.
     * @param SharedCNAMEPrefix Shared CNAME prefix. Enter a valid domain name prefix, such as "test-api" and "test-api.com". A maximum of 50 characters are allowed. 

Complete format of the shared CNAME: '<Custom prefix>+<A 12-character random string in ZoneId>+share.dnse[0-5].com'. 

For example, if the prefix is example.com, EdgeOne will create the shared CNAME: example.com.sai2ig51kaa5.share.dnse2.com.
     */
    public void setSharedCNAMEPrefix(String SharedCNAMEPrefix) {
        this.SharedCNAMEPrefix = SharedCNAMEPrefix;
    }

    /**
     * Get Description. It supports 1-50 characters. 
     * @return Description Description. It supports 1-50 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. It supports 1-50 characters.
     * @param Description Description. It supports 1-50 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSharedCNAMERequest(CreateSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SharedCNAMEPrefix != null) {
            this.SharedCNAMEPrefix = new String(source.SharedCNAMEPrefix);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SharedCNAMEPrefix", this.SharedCNAMEPrefix);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

