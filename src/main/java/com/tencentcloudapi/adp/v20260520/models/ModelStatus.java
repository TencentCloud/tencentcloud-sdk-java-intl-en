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

public class ModelStatus extends AbstractModel {

    /**
    * <p>Number of exclusive concurrencies</p>
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * <p>Whether it is exclusive concurrency</p>
    */
    @SerializedName("IsExclusive")
    @Expose
    private Boolean IsExclusive;

    /**
    * <p>Whether direct experience in the intelligent workbench is supported (model plaza details page: dynamically determined based on space_id; when false, the frontend disables the "experience now" button)</p>
    */
    @SerializedName("IsExperienceSupported")
    @Expose
    private Boolean IsExperienceSupported;

    /**
    * <p>Resource status</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>Not specified</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>Resource available</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>Resource exhausted</td></tr></table>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * <p>RPM call cap (current account dimension: use the configured value if available; otherwise, take default. 0 means not obtained)</p>
    */
    @SerializedName("RpmLimit")
    @Expose
    private String RpmLimit;

    /**
    * <p>TPM call upper limit (at the current account level: use the configured value if available; otherwise, take default. 0 means failed to obtain)</p>
    */
    @SerializedName("TpmLimit")
    @Expose
    private String TpmLimit;

    /**
     * Get <p>Number of exclusive concurrencies</p> 
     * @return Concurrency <p>Number of exclusive concurrencies</p>
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set <p>Number of exclusive concurrencies</p>
     * @param Concurrency <p>Number of exclusive concurrencies</p>
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get <p>Whether it is exclusive concurrency</p> 
     * @return IsExclusive <p>Whether it is exclusive concurrency</p>
     */
    public Boolean getIsExclusive() {
        return this.IsExclusive;
    }

    /**
     * Set <p>Whether it is exclusive concurrency</p>
     * @param IsExclusive <p>Whether it is exclusive concurrency</p>
     */
    public void setIsExclusive(Boolean IsExclusive) {
        this.IsExclusive = IsExclusive;
    }

    /**
     * Get <p>Whether direct experience in the intelligent workbench is supported (model plaza details page: dynamically determined based on space_id; when false, the frontend disables the "experience now" button)</p> 
     * @return IsExperienceSupported <p>Whether direct experience in the intelligent workbench is supported (model plaza details page: dynamically determined based on space_id; when false, the frontend disables the "experience now" button)</p>
     */
    public Boolean getIsExperienceSupported() {
        return this.IsExperienceSupported;
    }

    /**
     * Set <p>Whether direct experience in the intelligent workbench is supported (model plaza details page: dynamically determined based on space_id; when false, the frontend disables the "experience now" button)</p>
     * @param IsExperienceSupported <p>Whether direct experience in the intelligent workbench is supported (model plaza details page: dynamically determined based on space_id; when false, the frontend disables the "experience now" button)</p>
     */
    public void setIsExperienceSupported(Boolean IsExperienceSupported) {
        this.IsExperienceSupported = IsExperienceSupported;
    }

    /**
     * Get <p>Resource status</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>Not specified</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>Resource available</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>Resource exhausted</td></tr></table> 
     * @return ResourceStatus <p>Resource status</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>Not specified</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>Resource available</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>Resource exhausted</td></tr></table>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>Resource status</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>Not specified</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>Resource available</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>Resource exhausted</td></tr></table>
     * @param ResourceStatus <p>Resource status</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_STATUS_UNSPECIFIED</td><td>0</td><td>Not specified</td></tr><tr><td>RESOURCE_STATUS_AVAILABLE</td><td>1</td><td>Resource available</td></tr><tr><td>RESOURCE_STATUS_EXHAUSTED</td><td>2</td><td>Resource exhausted</td></tr></table>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get <p>RPM call cap (current account dimension: use the configured value if available; otherwise, take default. 0 means not obtained)</p> 
     * @return RpmLimit <p>RPM call cap (current account dimension: use the configured value if available; otherwise, take default. 0 means not obtained)</p>
     */
    public String getRpmLimit() {
        return this.RpmLimit;
    }

    /**
     * Set <p>RPM call cap (current account dimension: use the configured value if available; otherwise, take default. 0 means not obtained)</p>
     * @param RpmLimit <p>RPM call cap (current account dimension: use the configured value if available; otherwise, take default. 0 means not obtained)</p>
     */
    public void setRpmLimit(String RpmLimit) {
        this.RpmLimit = RpmLimit;
    }

    /**
     * Get <p>TPM call upper limit (at the current account level: use the configured value if available; otherwise, take default. 0 means failed to obtain)</p> 
     * @return TpmLimit <p>TPM call upper limit (at the current account level: use the configured value if available; otherwise, take default. 0 means failed to obtain)</p>
     */
    public String getTpmLimit() {
        return this.TpmLimit;
    }

    /**
     * Set <p>TPM call upper limit (at the current account level: use the configured value if available; otherwise, take default. 0 means failed to obtain)</p>
     * @param TpmLimit <p>TPM call upper limit (at the current account level: use the configured value if available; otherwise, take default. 0 means failed to obtain)</p>
     */
    public void setTpmLimit(String TpmLimit) {
        this.TpmLimit = TpmLimit;
    }

    public ModelStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelStatus(ModelStatus source) {
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.IsExclusive != null) {
            this.IsExclusive = new Boolean(source.IsExclusive);
        }
        if (source.IsExperienceSupported != null) {
            this.IsExperienceSupported = new Boolean(source.IsExperienceSupported);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.RpmLimit != null) {
            this.RpmLimit = new String(source.RpmLimit);
        }
        if (source.TpmLimit != null) {
            this.TpmLimit = new String(source.TpmLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "IsExclusive", this.IsExclusive);
        this.setParamSimple(map, prefix + "IsExperienceSupported", this.IsExperienceSupported);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "RpmLimit", this.RpmLimit);
        this.setParamSimple(map, prefix + "TpmLimit", this.TpmLimit);

    }
}

