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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppShareURLInfo extends AbstractModel {

    /**
    * Currently effective access control configuration
    */
    @SerializedName("AccessControl")
    @Expose
    private AppShareAccessControl AccessControl;

    /**
    * Share URL
    */
    @SerializedName("ShareUrl")
    @Expose
    private String ShareUrl;

    /**
     * Get Currently effective access control configuration 
     * @return AccessControl Currently effective access control configuration
     */
    public AppShareAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Currently effective access control configuration
     * @param AccessControl Currently effective access control configuration
     */
    public void setAccessControl(AppShareAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get Share URL 
     * @return ShareUrl Share URL
     */
    public String getShareUrl() {
        return this.ShareUrl;
    }

    /**
     * Set Share URL
     * @param ShareUrl Share URL
     */
    public void setShareUrl(String ShareUrl) {
        this.ShareUrl = ShareUrl;
    }

    public AppShareURLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppShareURLInfo(AppShareURLInfo source) {
        if (source.AccessControl != null) {
            this.AccessControl = new AppShareAccessControl(source.AccessControl);
        }
        if (source.ShareUrl != null) {
            this.ShareUrl = new String(source.ShareUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "ShareUrl", this.ShareUrl);

    }
}

