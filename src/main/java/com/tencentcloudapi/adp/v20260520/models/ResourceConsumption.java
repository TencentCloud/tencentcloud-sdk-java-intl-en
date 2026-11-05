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

public class ResourceConsumption extends AbstractModel {

    /**
    * <p>Feature tag. For the PLATFORM scenario, use the PlatformBizType enumeration name; for MODEL/PLUGIN scenarios, leave it empty</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>Consumption measurement unit</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second (second)</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item (item)</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet (sheet)</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character (character)</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (millisecond)</td></tr></tbody></table>
    */
    @SerializedName("Unit")
    @Expose
    private Long Unit;

    /**
    * <p>Consumption value</p>
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get <p>Feature tag. For the PLATFORM scenario, use the PlatformBizType enumeration name; for MODEL/PLUGIN scenarios, leave it empty</p> 
     * @return Label <p>Feature tag. For the PLATFORM scenario, use the PlatformBizType enumeration name; for MODEL/PLUGIN scenarios, leave it empty</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Feature tag. For the PLATFORM scenario, use the PlatformBizType enumeration name; for MODEL/PLUGIN scenarios, leave it empty</p>
     * @param Label <p>Feature tag. For the PLATFORM scenario, use the PlatformBizType enumeration name; for MODEL/PLUGIN scenarios, leave it empty</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Consumption measurement unit</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second (second)</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item (item)</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet (sheet)</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character (character)</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (millisecond)</td></tr></tbody></table> 
     * @return Unit <p>Consumption measurement unit</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second (second)</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item (item)</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet (sheet)</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character (character)</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (millisecond)</td></tr></tbody></table>
     */
    public Long getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>Consumption measurement unit</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second (second)</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item (item)</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet (sheet)</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character (character)</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (millisecond)</td></tr></tbody></table>
     * @param Unit <p>Consumption measurement unit</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOSAGE_UNIT_TOKEN</td><td>0</td><td>token (default)</td></tr><tr><td>DOSAGE_UNIT_PAGE_COUNT</td><td>1</td><td>page_count (page number)</td></tr><tr><td>DOSAGE_UNIT_TIMES</td><td>2</td><td>times (count)</td></tr><tr><td>DOSAGE_UNIT_SECOND</td><td>3</td><td>second (second)</td></tr><tr><td>DOSAGE_UNIT_ITEM</td><td>4</td><td>item (item)</td></tr><tr><td>DOSAGE_UNIT_SHEET</td><td>5</td><td>sheet (sheet)</td></tr><tr><td>DOSAGE_UNIT_CHARACTER</td><td>6</td><td>character (character)</td></tr><tr><td>DOSAGE_UNIT_GB</td><td>7</td><td>GB</td></tr><tr><td>DOSAGE_UNIT_NUMBER</td><td>8</td><td>number (count)</td></tr><tr><td>DOSAGE_UNIT_MILL_SECOND</td><td>9</td><td>mill_second (millisecond)</td></tr></tbody></table>
     */
    public void setUnit(Long Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>Consumption value</p> 
     * @return Value <p>Consumption value</p>
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>Consumption value</p>
     * @param Value <p>Consumption value</p>
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public ResourceConsumption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConsumption(ResourceConsumption source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

