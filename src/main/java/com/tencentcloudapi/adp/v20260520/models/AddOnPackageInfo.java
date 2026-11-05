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

public class AddOnPackageInfo extends AbstractModel {

    /**
    * <p>Total value-added packages</p>
    */
    @SerializedName("AddOnTotal")
    @Expose
    private Float AddOnTotal;

    /**
    * <p>Value-added package amount</p>
    */
    @SerializedName("AddOnUsage")
    @Expose
    private Float AddOnUsage;

    /**
    * <p>Total number of exclusive concurrencies</p>
    */
    @SerializedName("ExclusiveConcurrency")
    @Expose
    private Long ExclusiveConcurrency;

    /**
    * <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>2: Exhausted</li><li>3: Expired</li></ul>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * <p>Exclusive concurrency status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
    */
    @SerializedName("ConcurrencyStatus")
    @Expose
    private Long ConcurrencyStatus;

    /**
    * <p>Exclusive tpm</p>
    */
    @SerializedName("ExclusiveTpm")
    @Expose
    private Long ExclusiveTpm;

    /**
    * <p>Exclusive tpm status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
    */
    @SerializedName("ExclusiveTpmStatus")
    @Expose
    private Long ExclusiveTpmStatus;

    /**
    * <p>Exclusive computing unit</p>
    */
    @SerializedName("ExclusiveComputeUnit")
    @Expose
    private Long ExclusiveComputeUnit;

    /**
    * <p>Exclusive computing unit status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li><li>4: Terminated</li><li>5: Isolated</li><li>6: Not effective</li><li>7: Unavailable (when the package expires)</li></ul>
    */
    @SerializedName("ExclusiveComputeUnitStatus")
    @Expose
    private Long ExclusiveComputeUnitStatus;

    /**
     * Get <p>Total value-added packages</p> 
     * @return AddOnTotal <p>Total value-added packages</p>
     */
    public Float getAddOnTotal() {
        return this.AddOnTotal;
    }

    /**
     * Set <p>Total value-added packages</p>
     * @param AddOnTotal <p>Total value-added packages</p>
     */
    public void setAddOnTotal(Float AddOnTotal) {
        this.AddOnTotal = AddOnTotal;
    }

    /**
     * Get <p>Value-added package amount</p> 
     * @return AddOnUsage <p>Value-added package amount</p>
     */
    public Float getAddOnUsage() {
        return this.AddOnUsage;
    }

    /**
     * Set <p>Value-added package amount</p>
     * @param AddOnUsage <p>Value-added package amount</p>
     */
    public void setAddOnUsage(Float AddOnUsage) {
        this.AddOnUsage = AddOnUsage;
    }

    /**
     * Get <p>Total number of exclusive concurrencies</p> 
     * @return ExclusiveConcurrency <p>Total number of exclusive concurrencies</p>
     */
    public Long getExclusiveConcurrency() {
        return this.ExclusiveConcurrency;
    }

    /**
     * Set <p>Total number of exclusive concurrencies</p>
     * @param ExclusiveConcurrency <p>Total number of exclusive concurrencies</p>
     */
    public void setExclusiveConcurrency(Long ExclusiveConcurrency) {
        this.ExclusiveConcurrency = ExclusiveConcurrency;
    }

    /**
     * Get <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>2: Exhausted</li><li>3: Expired</li></ul> 
     * @return ResourceStatus <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>2: Exhausted</li><li>3: Expired</li></ul>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>2: Exhausted</li><li>3: Expired</li></ul>
     * @param ResourceStatus <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>2: Exhausted</li><li>3: Expired</li></ul>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get <p>Exclusive concurrency status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul> 
     * @return ConcurrencyStatus <p>Exclusive concurrency status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     */
    public Long getConcurrencyStatus() {
        return this.ConcurrencyStatus;
    }

    /**
     * Set <p>Exclusive concurrency status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     * @param ConcurrencyStatus <p>Exclusive concurrency status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     */
    public void setConcurrencyStatus(Long ConcurrencyStatus) {
        this.ConcurrencyStatus = ConcurrencyStatus;
    }

    /**
     * Get <p>Exclusive tpm</p> 
     * @return ExclusiveTpm <p>Exclusive tpm</p>
     */
    public Long getExclusiveTpm() {
        return this.ExclusiveTpm;
    }

    /**
     * Set <p>Exclusive tpm</p>
     * @param ExclusiveTpm <p>Exclusive tpm</p>
     */
    public void setExclusiveTpm(Long ExclusiveTpm) {
        this.ExclusiveTpm = ExclusiveTpm;
    }

    /**
     * Get <p>Exclusive tpm status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul> 
     * @return ExclusiveTpmStatus <p>Exclusive tpm status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     */
    public Long getExclusiveTpmStatus() {
        return this.ExclusiveTpmStatus;
    }

    /**
     * Set <p>Exclusive tpm status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     * @param ExclusiveTpmStatus <p>Exclusive tpm status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li></ul>
     */
    public void setExclusiveTpmStatus(Long ExclusiveTpmStatus) {
        this.ExclusiveTpmStatus = ExclusiveTpmStatus;
    }

    /**
     * Get <p>Exclusive computing unit</p> 
     * @return ExclusiveComputeUnit <p>Exclusive computing unit</p>
     */
    public Long getExclusiveComputeUnit() {
        return this.ExclusiveComputeUnit;
    }

    /**
     * Set <p>Exclusive computing unit</p>
     * @param ExclusiveComputeUnit <p>Exclusive computing unit</p>
     */
    public void setExclusiveComputeUnit(Long ExclusiveComputeUnit) {
        this.ExclusiveComputeUnit = ExclusiveComputeUnit;
    }

    /**
     * Get <p>Exclusive computing unit status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li><li>4: Terminated</li><li>5: Isolated</li><li>6: Not effective</li><li>7: Unavailable (when the package expires)</li></ul> 
     * @return ExclusiveComputeUnitStatus <p>Exclusive computing unit status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li><li>4: Terminated</li><li>5: Isolated</li><li>6: Not effective</li><li>7: Unavailable (when the package expires)</li></ul>
     */
    public Long getExclusiveComputeUnitStatus() {
        return this.ExclusiveComputeUnitStatus;
    }

    /**
     * Set <p>Exclusive computing unit status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li><li>4: Terminated</li><li>5: Isolated</li><li>6: Not effective</li><li>7: Unavailable (when the package expires)</li></ul>
     * @param ExclusiveComputeUnitStatus <p>Exclusive computing unit status</p><p>Enumeration values:</p><ul><li>1: Available</li><li>3: Expired</li><li>4: Terminated</li><li>5: Isolated</li><li>6: Not effective</li><li>7: Unavailable (when the package expires)</li></ul>
     */
    public void setExclusiveComputeUnitStatus(Long ExclusiveComputeUnitStatus) {
        this.ExclusiveComputeUnitStatus = ExclusiveComputeUnitStatus;
    }

    public AddOnPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnPackageInfo(AddOnPackageInfo source) {
        if (source.AddOnTotal != null) {
            this.AddOnTotal = new Float(source.AddOnTotal);
        }
        if (source.AddOnUsage != null) {
            this.AddOnUsage = new Float(source.AddOnUsage);
        }
        if (source.ExclusiveConcurrency != null) {
            this.ExclusiveConcurrency = new Long(source.ExclusiveConcurrency);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.ConcurrencyStatus != null) {
            this.ConcurrencyStatus = new Long(source.ConcurrencyStatus);
        }
        if (source.ExclusiveTpm != null) {
            this.ExclusiveTpm = new Long(source.ExclusiveTpm);
        }
        if (source.ExclusiveTpmStatus != null) {
            this.ExclusiveTpmStatus = new Long(source.ExclusiveTpmStatus);
        }
        if (source.ExclusiveComputeUnit != null) {
            this.ExclusiveComputeUnit = new Long(source.ExclusiveComputeUnit);
        }
        if (source.ExclusiveComputeUnitStatus != null) {
            this.ExclusiveComputeUnitStatus = new Long(source.ExclusiveComputeUnitStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddOnTotal", this.AddOnTotal);
        this.setParamSimple(map, prefix + "AddOnUsage", this.AddOnUsage);
        this.setParamSimple(map, prefix + "ExclusiveConcurrency", this.ExclusiveConcurrency);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ConcurrencyStatus", this.ConcurrencyStatus);
        this.setParamSimple(map, prefix + "ExclusiveTpm", this.ExclusiveTpm);
        this.setParamSimple(map, prefix + "ExclusiveTpmStatus", this.ExclusiveTpmStatus);
        this.setParamSimple(map, prefix + "ExclusiveComputeUnit", this.ExclusiveComputeUnit);
        this.setParamSimple(map, prefix + "ExclusiveComputeUnitStatus", this.ExclusiveComputeUnitStatus);

    }
}

