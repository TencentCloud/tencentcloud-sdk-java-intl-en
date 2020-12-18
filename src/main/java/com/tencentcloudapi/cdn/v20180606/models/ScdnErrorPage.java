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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnErrorPage extends AbstractModel{

    /**
    * Status code
    */
    @SerializedName("RedirectCode")
    @Expose
    private Long RedirectCode;

    /**
    * Redirection URL
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get Status code 
     * @return RedirectCode Status code
     */
    public Long getRedirectCode() {
        return this.RedirectCode;
    }

    /**
     * Set Status code
     * @param RedirectCode Status code
     */
    public void setRedirectCode(Long RedirectCode) {
        this.RedirectCode = RedirectCode;
    }

    /**
     * Get Redirection URL 
     * @return RedirectUrl Redirection URL
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Redirection URL
     * @param RedirectUrl Redirection URL
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectCode", this.RedirectCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

