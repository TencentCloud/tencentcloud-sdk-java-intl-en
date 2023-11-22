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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropPageDetail extends AbstractModel {

    /**
    * The ID of the block page. Specify `0` to use the default block page. 
(Disused) If 0 is passed, the default block page will be used.
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * The HTTP status code to trigger the block page. Range: 100-600, excluding 3xx codes. Code 566: Requests blocked by managed rules. Code 567: Requests blocked by web security rules (except managed rules).
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * The block page file or URL.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of the block page. Values:
<li>`page`: Return the specified page.</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Type=page`.
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
     * Get The ID of the block page. Specify `0` to use the default block page. 
(Disused) If 0 is passed, the default block page will be used. 
     * @return PageId The ID of the block page. Specify `0` to use the default block page. 
(Disused) If 0 is passed, the default block page will be used.
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set The ID of the block page. Specify `0` to use the default block page. 
(Disused) If 0 is passed, the default block page will be used.
     * @param PageId The ID of the block page. Specify `0` to use the default block page. 
(Disused) If 0 is passed, the default block page will be used.
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get The HTTP status code to trigger the block page. Range: 100-600, excluding 3xx codes. Code 566: Requests blocked by managed rules. Code 567: Requests blocked by web security rules (except managed rules). 
     * @return StatusCode The HTTP status code to trigger the block page. Range: 100-600, excluding 3xx codes. Code 566: Requests blocked by managed rules. Code 567: Requests blocked by web security rules (except managed rules).
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set The HTTP status code to trigger the block page. Range: 100-600, excluding 3xx codes. Code 566: Requests blocked by managed rules. Code 567: Requests blocked by web security rules (except managed rules).
     * @param StatusCode The HTTP status code to trigger the block page. Range: 100-600, excluding 3xx codes. Code 566: Requests blocked by managed rules. Code 567: Requests blocked by web security rules (except managed rules).
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get The block page file or URL. 
     * @return Name The block page file or URL.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The block page file or URL.
     * @param Name The block page file or URL.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of the block page. Values:
<li>`page`: Return the specified page.</li>
 
     * @return Type Type of the block page. Values:
<li>`page`: Return the specified page.</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the block page. Values:
<li>`page`: Return the specified page.</li>

     * @param Type Type of the block page. Values:
<li>`page`: Return the specified page.</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Type=page`. 
     * @return CustomResponseId ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Type=page`.
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Type=page`.
     * @param CustomResponseId ID of custom response. The ID can be obtained via the `DescribeCustomErrorPages` API. It's required when `Type=page`.
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

