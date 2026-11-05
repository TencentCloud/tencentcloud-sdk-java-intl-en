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

public class MetricOverview extends AbstractModel {

    /**
    * <p>Metric key. For the value, see the key allowlist in the MetricOverview note.</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Month-over-month percentage. Enter 0 if there is no month-over-month comparison</p>
    */
    @SerializedName("Mom")
    @Expose
    private Float Mom;

    /**
    * <p>Metric unit, enumeration value DosageUnit; for the mapping between key and unit, see the MetricOverview comment allowlist</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (ms)</td></tr></tbody></table>
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
    * <p>Metric value.</p>
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get <p>Metric key. For the value, see the key allowlist in the MetricOverview note.</p> 
     * @return Key <p>Metric key. For the value, see the key allowlist in the MetricOverview note.</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Metric key. For the value, see the key allowlist in the MetricOverview note.</p>
     * @param Key <p>Metric key. For the value, see the key allowlist in the MetricOverview note.</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Month-over-month percentage. Enter 0 if there is no month-over-month comparison</p> 
     * @return Mom <p>Month-over-month percentage. Enter 0 if there is no month-over-month comparison</p>
     */
    public Float getMom() {
        return this.Mom;
    }

    /**
     * Set <p>Month-over-month percentage. Enter 0 if there is no month-over-month comparison</p>
     * @param Mom <p>Month-over-month percentage. Enter 0 if there is no month-over-month comparison</p>
     */
    public void setMom(Float Mom) {
        this.Mom = Mom;
    }

    /**
     * Get <p>Metric unit, enumeration value DosageUnit; for the mapping between key and unit, see the MetricOverview comment allowlist</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (ms)</td></tr></tbody></table> 
     * @return Unit <p>Metric unit, enumeration value DosageUnit; for the mapping between key and unit, see the MetricOverview comment allowlist</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (ms)</td></tr></tbody></table>
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>Metric unit, enumeration value DosageUnit; for the mapping between key and unit, see the MetricOverview comment allowlist</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (ms)</td></tr></tbody></table>
     * @param Unit <p>Metric unit, enumeration value DosageUnit; for the mapping between key and unit, see the MetricOverview comment allowlist</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (ms)</td></tr></tbody></table>
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>Metric value.</p> 
     * @return Value <p>Metric value.</p>
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>Metric value.</p>
     * @param Value <p>Metric value.</p>
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public MetricOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricOverview(MetricOverview source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Mom != null) {
            this.Mom = new Float(source.Mom);
        }
        if (source.Unit != null) {
            this.Unit = new Long(source.Unit);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Mom", this.Mom);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

