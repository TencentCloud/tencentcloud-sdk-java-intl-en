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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSampleSnapshotInfo extends AbstractModel {

    /**
    * Information set of sampled screenshots with the specified specifications. Each element represents a set of sampled screenshots with the same specification.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleSnapshotSet")
    @Expose
    private MediaSampleSnapshotItem [] SampleSnapshotSet;

    /**
     * Get Information set of sampled screenshots with the specified specifications. Each element represents a set of sampled screenshots with the same specification.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SampleSnapshotSet Information set of sampled screenshots with the specified specifications. Each element represents a set of sampled screenshots with the same specification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSampleSnapshotItem [] getSampleSnapshotSet() {
        return this.SampleSnapshotSet;
    }

    /**
     * Set Information set of sampled screenshots with the specified specifications. Each element represents a set of sampled screenshots with the same specification.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SampleSnapshotSet Information set of sampled screenshots with the specified specifications. Each element represents a set of sampled screenshots with the same specification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleSnapshotSet(MediaSampleSnapshotItem [] SampleSnapshotSet) {
        this.SampleSnapshotSet = SampleSnapshotSet;
    }

    public MediaSampleSnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSampleSnapshotInfo(MediaSampleSnapshotInfo source) {
        if (source.SampleSnapshotSet != null) {
            this.SampleSnapshotSet = new MediaSampleSnapshotItem[source.SampleSnapshotSet.length];
            for (int i = 0; i < source.SampleSnapshotSet.length; i++) {
                this.SampleSnapshotSet[i] = new MediaSampleSnapshotItem(source.SampleSnapshotSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SampleSnapshotSet.", this.SampleSnapshotSet);

    }
}

