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

public class DropPageDetail extends AbstractModel {

    /**
    * Unique Id of the interception page. The system includes a built-in interception page by default, with Id 0.
The Id can be obtained by uploading via the blocking page creation interface. If 0 is passed in, the system default blocking page is used. This parameter is deprecated.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * HTTP status code of the interception page. Value range: 100–600. 3xx status codes are not supported. Default for managed rule interception page: 566. Default for security protection (excluding managed rules) interception page: 567.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Page file name or url.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Page type, with values:
<li>page: Specified page.</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Id. You can obtain this Id through the API for querying the custom error page list. The default value is `default`, which uses the system default page. This field is required and cannot be empty when Type is `page`.
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
     * Get Unique Id of the interception page. The system includes a built-in interception page by default, with Id 0.
The Id can be obtained by uploading via the blocking page creation interface. If 0 is passed in, the system default blocking page is used. This parameter is deprecated. 
     * @return PageId Unique Id of the interception page. The system includes a built-in interception page by default, with Id 0.
The Id can be obtained by uploading via the blocking page creation interface. If 0 is passed in, the system default blocking page is used. This parameter is deprecated.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set Unique Id of the interception page. The system includes a built-in interception page by default, with Id 0.
The Id can be obtained by uploading via the blocking page creation interface. If 0 is passed in, the system default blocking page is used. This parameter is deprecated.
     * @param PageId Unique Id of the interception page. The system includes a built-in interception page by default, with Id 0.
The Id can be obtained by uploading via the blocking page creation interface. If 0 is passed in, the system default blocking page is used. This parameter is deprecated.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get HTTP status code of the interception page. Value range: 100–600. 3xx status codes are not supported. Default for managed rule interception page: 566. Default for security protection (excluding managed rules) interception page: 567. 
     * @return StatusCode HTTP status code of the interception page. Value range: 100–600. 3xx status codes are not supported. Default for managed rule interception page: 566. Default for security protection (excluding managed rules) interception page: 567.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set HTTP status code of the interception page. Value range: 100–600. 3xx status codes are not supported. Default for managed rule interception page: 566. Default for security protection (excluding managed rules) interception page: 567.
     * @param StatusCode HTTP status code of the interception page. Value range: 100–600. 3xx status codes are not supported. Default for managed rule interception page: 566. Default for security protection (excluding managed rules) interception page: 567.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Page file name or url. 
     * @return Name Page file name or url.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Page file name or url.
     * @param Name Page file name or url.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Page type, with values:
<li>page: Specified page.</li>
 
     * @return Type Page type, with values:
<li>page: Specified page.</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Page type, with values:
<li>page: Specified page.</li>

     * @param Type Page type, with values:
<li>page: Specified page.</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Id. You can obtain this Id through the API for querying the custom error page list. The default value is `default`, which uses the system default page. This field is required and cannot be empty when Type is `page`. 
     * @return CustomResponseId Id. You can obtain this Id through the API for querying the custom error page list. The default value is `default`, which uses the system default page. This field is required and cannot be empty when Type is `page`.
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set Id. You can obtain this Id through the API for querying the custom error page list. The default value is `default`, which uses the system default page. This field is required and cannot be empty when Type is `page`.
     * @param CustomResponseId Id. You can obtain this Id through the API for querying the custom error page list. The default value is `default`, which uses the system default page. This field is required and cannot be empty when Type is `page`.
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    public DropPageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropPageDetail(DropPageDetail source) {
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CustomResponseId != null) {
            this.CustomResponseId = new String(source.CustomResponseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);

    }
}

