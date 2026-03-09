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

public class HostNameIndexSettings extends AbstractModel {

    /**
    * <p>Whether to enable serial number creation for instance hostname. not enabled by default. valid values:</p><p>TRUE: enable serial number creation for instance hostname. FALSE: disable serial number creation for instance hostname.</p>.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Initial serial number. value range depends on the IndexLength parameter: - when IndexLength is 0, value range is [0, 99999999]. - when IndexLength is [1, 8], value range is [0, 10^IndexLength-1], and the maximum value is the maximum digit of the specified length. default value of initial serial number is as follows: - first-time enabling incremental serial number: default value is 0 (display digits depend on IndexLength, for example if IndexLength is 4, display value is 0000). - non-first-time enabling incremental serial number: continuation of previous incremental serial number, for example if last usage incremented to serial number 069, new default value is 070. note: modification of initial serial number may lead to duplication within the scaling group.</p>.
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
     * Get <p>Whether to enable serial number creation for instance hostname. not enabled by default. valid values:</p><p>TRUE: enable serial number creation for instance hostname. FALSE: disable serial number creation for instance hostname.</p>. 
     * @return Enabled <p>Whether to enable serial number creation for instance hostname. not enabled by default. valid values:</p><p>TRUE: enable serial number creation for instance hostname. FALSE: disable serial number creation for instance hostname.</p>.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable serial number creation for instance hostname. not enabled by default. valid values:</p><p>TRUE: enable serial number creation for instance hostname. FALSE: disable serial number creation for instance hostname.</p>.
     * @param Enabled <p>Whether to enable serial number creation for instance hostname. not enabled by default. valid values:</p><p>TRUE: enable serial number creation for instance hostname. FALSE: disable serial number creation for instance hostname.</p>.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Initial serial number. value range depends on the IndexLength parameter: - when IndexLength is 0, value range is [0, 99999999]. - when IndexLength is [1, 8], value range is [0, 10^IndexLength-1], and the maximum value is the maximum digit of the specified length. default value of initial serial number is as follows: - first-time enabling incremental serial number: default value is 0 (display digits depend on IndexLength, for example if IndexLength is 4, display value is 0000). - non-first-time enabling incremental serial number: continuation of previous incremental serial number, for example if last usage incremented to serial number 069, new default value is 070. note: modification of initial serial number may lead to duplication within the scaling group.</p>. 
     * @return BeginIndex <p>Initial serial number. value range depends on the IndexLength parameter: - when IndexLength is 0, value range is [0, 99999999]. - when IndexLength is [1, 8], value range is [0, 10^IndexLength-1], and the maximum value is the maximum digit of the specified length. default value of initial serial number is as follows: - first-time enabling incremental serial number: default value is 0 (display digits depend on IndexLength, for example if IndexLength is 4, display value is 0000). - non-first-time enabling incremental serial number: continuation of previous incremental serial number, for example if last usage incremented to serial number 069, new default value is 070. note: modification of initial serial number may lead to duplication within the scaling group.</p>.
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set <p>Initial serial number. value range depends on the IndexLength parameter: - when IndexLength is 0, value range is [0, 99999999]. - when IndexLength is [1, 8], value range is [0, 10^IndexLength-1], and the maximum value is the maximum digit of the specified length. default value of initial serial number is as follows: - first-time enabling incremental serial number: default value is 0 (display digits depend on IndexLength, for example if IndexLength is 4, display value is 0000). - non-first-time enabling incremental serial number: continuation of previous incremental serial number, for example if last usage incremented to serial number 069, new default value is 070. note: modification of initial serial number may lead to duplication within the scaling group.</p>.
     * @param BeginIndex <p>Initial serial number. value range depends on the IndexLength parameter: - when IndexLength is 0, value range is [0, 99999999]. - when IndexLength is [1, 8], value range is [0, 10^IndexLength-1], and the maximum value is the maximum digit of the specified length. default value of initial serial number is as follows: - first-time enabling incremental serial number: default value is 0 (display digits depend on IndexLength, for example if IndexLength is 4, display value is 0000). - non-first-time enabling incremental serial number: continuation of previous incremental serial number, for example if last usage incremented to serial number 069, new default value is 070. note: modification of initial serial number may lead to duplication within the scaling group.</p>.
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

    public HostNameIndexSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostNameIndexSettings(HostNameIndexSettings source) {
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

