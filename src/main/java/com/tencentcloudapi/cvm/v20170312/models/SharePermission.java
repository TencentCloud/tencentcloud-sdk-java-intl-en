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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharePermission extends AbstractModel {

    /**
    * Time when an image was shared.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * ID of the account with which the image is shared.
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Get Time when an image was shared. 
     * @return CreatedTime Time when an image was shared.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Time when an image was shared.
     * @param CreatedTime Time when an image was shared.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get ID of the account with which the image is shared. 
     * @return AccountId ID of the account with which the image is shared.
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set ID of the account with which the image is shared.
     * @param AccountId ID of the account with which the image is shared.
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public SharePermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharePermission(SharePermission source) {
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

