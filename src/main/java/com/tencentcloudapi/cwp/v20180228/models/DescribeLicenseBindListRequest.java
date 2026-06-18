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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseBindListRequest extends AbstractModel {

    /**
    * <p>License ID. The value is the value of the LicenseId parameter under the List object of the DescribeLicenseList API.</p>
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * <p>License type</p><p>Valid values:</p><ul><li>0: Pro Edition - pay-as-you-go</li><li>1: Pro Edition - monthly subscription (CWP)</li><li>2: Ultimate Edition - monthly subscription (CWP)</li><li>3: Lightweight Edition - LH monthly subscription</li><li>6: Pro Edition - monthly subscription (CSC)</li><li>7: Ultimate Edition - monthly subscription (CSC)</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * <p>Resource ID. The value is the value of the ResourceId parameter under the List object of the DescribeLicenseList API.</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <li>Fuzzy search by InstanceID, IP, or <p>MachineName</p></li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>The maximum number of entries. Default value: 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>License ID. The value is the value of the LicenseId parameter under the List object of the DescribeLicenseList API.</p> 
     * @return LicenseId <p>License ID. The value is the value of the LicenseId parameter under the List object of the DescribeLicenseList API.</p>
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set <p>License ID. The value is the value of the LicenseId parameter under the List object of the DescribeLicenseList API.</p>
     * @param LicenseId <p>License ID. The value is the value of the LicenseId parameter under the List object of the DescribeLicenseList API.</p>
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get <p>License type</p><p>Valid values:</p><ul><li>0: Pro Edition - pay-as-you-go</li><li>1: Pro Edition - monthly subscription (CWP)</li><li>2: Ultimate Edition - monthly subscription (CWP)</li><li>3: Lightweight Edition - LH monthly subscription</li><li>6: Pro Edition - monthly subscription (CSC)</li><li>7: Ultimate Edition - monthly subscription (CSC)</li></ul> 
     * @return LicenseType <p>License type</p><p>Valid values:</p><ul><li>0: Pro Edition - pay-as-you-go</li><li>1: Pro Edition - monthly subscription (CWP)</li><li>2: Ultimate Edition - monthly subscription (CWP)</li><li>3: Lightweight Edition - LH monthly subscription</li><li>6: Pro Edition - monthly subscription (CSC)</li><li>7: Ultimate Edition - monthly subscription (CSC)</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>License type</p><p>Valid values:</p><ul><li>0: Pro Edition - pay-as-you-go</li><li>1: Pro Edition - monthly subscription (CWP)</li><li>2: Ultimate Edition - monthly subscription (CWP)</li><li>3: Lightweight Edition - LH monthly subscription</li><li>6: Pro Edition - monthly subscription (CSC)</li><li>7: Ultimate Edition - monthly subscription (CSC)</li></ul>
     * @param LicenseType <p>License type</p><p>Valid values:</p><ul><li>0: Pro Edition - pay-as-you-go</li><li>1: Pro Edition - monthly subscription (CWP)</li><li>2: Ultimate Edition - monthly subscription (CWP)</li><li>3: Lightweight Edition - LH monthly subscription</li><li>6: Pro Edition - monthly subscription (CSC)</li><li>7: Ultimate Edition - monthly subscription (CSC)</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>Resource ID. The value is the value of the ResourceId parameter under the List object of the DescribeLicenseList API.</p> 
     * @return ResourceId <p>Resource ID. The value is the value of the ResourceId parameter under the List object of the DescribeLicenseList API.</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID. The value is the value of the ResourceId parameter under the List object of the DescribeLicenseList API.</p>
     * @param ResourceId <p>Resource ID. The value is the value of the ResourceId parameter under the List object of the DescribeLicenseList API.</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <li>Fuzzy search by InstanceID, IP, or <p>MachineName</p></li> 
     * @return Filters <li>Fuzzy search by InstanceID, IP, or <p>MachineName</p></li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>Fuzzy search by InstanceID, IP, or <p>MachineName</p></li>
     * @param Filters <li>Fuzzy search by InstanceID, IP, or <p>MachineName</p></li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>The maximum number of entries. Default value: 10.</p> 
     * @return Limit <p>The maximum number of entries. Default value: 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>The maximum number of entries. Default value: 10.</p>
     * @param Limit <p>The maximum number of entries. Default value: 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLicenseBindListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseBindListRequest(DescribeLicenseBindListRequest source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

