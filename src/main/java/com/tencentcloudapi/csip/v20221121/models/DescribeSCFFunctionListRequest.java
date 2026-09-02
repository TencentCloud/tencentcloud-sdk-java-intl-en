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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSCFFunctionListRequest extends AbstractModel {

    /**
    * SCF region
Parameter format: Tencent Cloud standard Region, for example, ap-guangzhou
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * Namespace name
Parameter value reference: obtain through the DescribeSCFNamespaceList API
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Number of items per page
Valid values: [1, 100]
Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
Valid values: [0, +∞)
Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get SCF region
Parameter format: Tencent Cloud standard Region, for example, ap-guangzhou 
     * @return SCFRegion SCF region
Parameter format: Tencent Cloud standard Region, for example, ap-guangzhou
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set SCF region
Parameter format: Tencent Cloud standard Region, for example, ap-guangzhou
     * @param SCFRegion SCF region
Parameter format: Tencent Cloud standard Region, for example, ap-guangzhou
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get Namespace name
Parameter value reference: obtain through the DescribeSCFNamespaceList API 
     * @return Namespace Namespace name
Parameter value reference: obtain through the DescribeSCFNamespaceList API
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name
Parameter value reference: obtain through the DescribeSCFNamespaceList API
     * @param Namespace Namespace name
Parameter value reference: obtain through the DescribeSCFNamespaceList API
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Number of items per page
Valid values: [1, 100]
Default value: 20 
     * @return Limit Number of items per page
Valid values: [1, 100]
Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page
Valid values: [1, 100]
Default value: 20
     * @param Limit Number of items per page
Valid values: [1, 100]
Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset.
Valid values: [0, +∞)
Default value: 0 
     * @return Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
Valid values: [0, +∞)
Default value: 0
     * @param Offset Pagination offset.
Valid values: [0, +∞)
Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSCFFunctionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSCFFunctionListRequest(DescribeSCFFunctionListRequest source) {
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

