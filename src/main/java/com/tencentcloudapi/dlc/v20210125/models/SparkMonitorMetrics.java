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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkMonitorMetrics extends AbstractModel {

    /**
    * The shuffle data (in bytes) that overflows to COS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShuffleWriteBytesCos")
    @Expose
    private Long ShuffleWriteBytesCos;

    /**
    * The total shuffle data (in bytes).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShuffleWriteBytesTotal")
    @Expose
    private Long ShuffleWriteBytesTotal;

    /**
     * Get The shuffle data (in bytes) that overflows to COS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShuffleWriteBytesCos The shuffle data (in bytes) that overflows to COS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShuffleWriteBytesCos() {
        return this.ShuffleWriteBytesCos;
    }

    /**
     * Set The shuffle data (in bytes) that overflows to COS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShuffleWriteBytesCos The shuffle data (in bytes) that overflows to COS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShuffleWriteBytesCos(Long ShuffleWriteBytesCos) {
        this.ShuffleWriteBytesCos = ShuffleWriteBytesCos;
    }

    /**
     * Get The total shuffle data (in bytes).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShuffleWriteBytesTotal The total shuffle data (in bytes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShuffleWriteBytesTotal() {
        return this.ShuffleWriteBytesTotal;
    }

    /**
     * Set The total shuffle data (in bytes).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShuffleWriteBytesTotal The total shuffle data (in bytes).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShuffleWriteBytesTotal(Long ShuffleWriteBytesTotal) {
        this.ShuffleWriteBytesTotal = ShuffleWriteBytesTotal;
    }

    public SparkMonitorMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkMonitorMetrics(SparkMonitorMetrics source) {
        if (source.ShuffleWriteBytesCos != null) {
            this.ShuffleWriteBytesCos = new Long(source.ShuffleWriteBytesCos);
        }
        if (source.ShuffleWriteBytesTotal != null) {
            this.ShuffleWriteBytesTotal = new Long(source.ShuffleWriteBytesTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShuffleWriteBytesCos", this.ShuffleWriteBytesCos);
        this.setParamSimple(map, prefix + "ShuffleWriteBytesTotal", this.ShuffleWriteBytesTotal);

    }
}

