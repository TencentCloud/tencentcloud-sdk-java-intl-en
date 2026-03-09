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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNameIndexSettings extends AbstractModel {

    /**
    * <p>Whether to enable instance creation sequencing, disabled by default. valid values:</p><p><strong>TRUE</strong>: indicates that instance creation sequencing is enabled; <strong>FALSE</strong>: indicates that instance creation sequencing is disabled</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Initial serial number. the value range is related to the IndexLength parameter: - when IndexLength is 0, the value range is [0, 99999999]. - when IndexLength is [1, 8], the value range is [0, 10^IndexLength-1], and the maximum value is the maximum number with the specified digits. the default value of the initial serial number is as follows: - first-time enabling of incremental serial number: the default value is 0 (the display length is related to IndexLength, for example, if IndexLength is 4, the display value is 0000). - non-first-time enabling of incremental serial number: the previous incremental serial number is postponed, for example, if the last usage incremented to serial number 069, the new default initial serial number is 070. note: modifying the initial serial number may lead to duplication within the scaling group.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
    * <P>Incremental serial number length, defaults to 0, means no specified length. value range: 0-8, maximum is integer 8. - length set to 3, display form: 000, 001, 002 ... 010, 011 ... 100 ... 999, maximum is 999. - length set to 0, display form: 0, 1, 2 ... 10, 11 ... 100 ... 1000 ... 10000 ... 99999999, maximum is 99999999. note: continuous incremental serial number exceeding the limit can cause scale-out failure. do not set too small incremental serial number length.</p>.
    */
    @SerializedName("IndexLength")
    @Expose
    private Long IndexLength;

    /**
     * Get <p>Whether to enable instance creation sequencing, disabled by default. valid values:</p><p><strong>TRUE</strong>: indicates that instance creation sequencing is enabled; <strong>FALSE</strong>: indicates that instance creation sequencing is disabled</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled <p>Whether to enable instance creation sequencing, disabled by default. valid values:</p><p><strong>TRUE</strong>: indicates that instance creation sequencing is enabled; <strong>FALSE</strong>: indicates that instance creation sequencing is disabled</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable instance creation sequencing, disabled by default. valid values:</p><p><strong>TRUE</strong>: indicates that instance creation sequencing is enabled; <strong>FALSE</strong>: indicates that instance creation sequencing is disabled</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled <p>Whether to enable instance creation sequencing, disabled by default. valid values:</p><p><strong>TRUE</strong>: indicates that instance creation sequencing is enabled; <strong>FALSE</strong>: indicates that instance creation sequencing is disabled</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Initial serial number. the value range is related to the IndexLength parameter: - when IndexLength is 0, the value range is [0, 99999999]. - when IndexLength is [1, 8], the value range is [0, 10^IndexLength-1], and the maximum value is the maximum number with the specified digits. the default value of the initial serial number is as follows: - first-time enabling of incremental serial number: the default value is 0 (the display length is related to IndexLength, for example, if IndexLength is 4, the display value is 0000). - non-first-time enabling of incremental serial number: the previous incremental serial number is postponed, for example, if the last usage incremented to serial number 069, the new default initial serial number is 070. note: modifying the initial serial number may lead to duplication within the scaling group.</p>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginIndex <p>Initial serial number. the value range is related to the IndexLength parameter: - when IndexLength is 0, the value range is [0, 99999999]. - when IndexLength is [1, 8], the value range is [0, 10^IndexLength-1], and the maximum value is the maximum number with the specified digits. the default value of the initial serial number is as follows: - first-time enabling of incremental serial number: the default value is 0 (the display length is related to IndexLength, for example, if IndexLength is 4, the display value is 0000). - non-first-time enabling of incremental serial number: the previous incremental serial number is postponed, for example, if the last usage incremented to serial number 069, the new default initial serial number is 070. note: modifying the initial serial number may lead to duplication within the scaling group.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set <p>Initial serial number. the value range is related to the IndexLength parameter: - when IndexLength is 0, the value range is [0, 99999999]. - when IndexLength is [1, 8], the value range is [0, 10^IndexLength-1], and the maximum value is the maximum number with the specified digits. the default value of the initial serial number is as follows: - first-time enabling of incremental serial number: the default value is 0 (the display length is related to IndexLength, for example, if IndexLength is 4, the display value is 0000). - non-first-time enabling of incremental serial number: the previous incremental serial number is postponed, for example, if the last usage incremented to serial number 069, the new default initial serial number is 070. note: modifying the initial serial number may lead to duplication within the scaling group.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginIndex <p>Initial serial number. the value range is related to the IndexLength parameter: - when IndexLength is 0, the value range is [0, 99999999]. - when IndexLength is [1, 8], the value range is [0, 10^IndexLength-1], and the maximum value is the maximum number with the specified digits. the default value of the initial serial number is as follows: - first-time enabling of incremental serial number: the default value is 0 (the display length is related to IndexLength, for example, if IndexLength is 4, the display value is 0000). - non-first-time enabling of incremental serial number: the previous incremental serial number is postponed, for example, if the last usage incremented to serial number 069, the new default initial serial number is 070. note: modifying the initial serial number may lead to duplication within the scaling group.</p>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    /**
     * Get <P>Incremental serial number length, defaults to 0, means no specified length. value range: 0-8, maximum is integer 8. - length set to 3, display form: 000, 001, 002 ... 010, 011 ... 100 ... 999, maximum is 999. - length set to 0, display form: 0, 1, 2 ... 10, 11 ... 100 ... 1000 ... 10000 ... 99999999, maximum is 99999999. note: continuous incremental serial number exceeding the limit can cause scale-out failure. do not set too small incremental serial number length.</p>. 
     * @return IndexLength <P>Incremental serial number length, defaults to 0, means no specified length. value range: 0-8, maximum is integer 8. - length set to 3, display form: 000, 001, 002 ... 010, 011 ... 100 ... 999, maximum is 999. - length set to 0, display form: 0, 1, 2 ... 10, 11 ... 100 ... 1000 ... 10000 ... 99999999, maximum is 99999999. note: continuous incremental serial number exceeding the limit can cause scale-out failure. do not set too small incremental serial number length.</p>.
     */
    public Long getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set <P>Incremental serial number length, defaults to 0, means no specified length. value range: 0-8, maximum is integer 8. - length set to 3, display form: 000, 001, 002 ... 010, 011 ... 100 ... 999, maximum is 999. - length set to 0, display form: 0, 1, 2 ... 10, 11 ... 100 ... 1000 ... 10000 ... 99999999, maximum is 99999999. note: continuous incremental serial number exceeding the limit can cause scale-out failure. do not set too small incremental serial number length.</p>.
     * @param IndexLength <P>Incremental serial number length, defaults to 0, means no specified length. value range: 0-8, maximum is integer 8. - length set to 3, display form: 000, 001, 002 ... 010, 011 ... 100 ... 999, maximum is 999. - length set to 0, display form: 0, 1, 2 ... 10, 11 ... 100 ... 1000 ... 10000 ... 99999999, maximum is 99999999. note: continuous incremental serial number exceeding the limit can cause scale-out failure. do not set too small incremental serial number length.</p>.
     */
    public void setIndexLength(Long IndexLength) {
        this.IndexLength = IndexLength;
    }

    public InstanceNameIndexSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNameIndexSettings(InstanceNameIndexSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Long(source.IndexLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);

    }
}

