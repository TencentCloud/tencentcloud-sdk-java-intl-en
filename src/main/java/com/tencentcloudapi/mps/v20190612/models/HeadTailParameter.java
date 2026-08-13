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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HeadTailParameter extends AbstractModel {

    /**
    * Opening scene list.
    */
    @SerializedName("HeadSet")
    @Expose
    private MediaInputInfo [] HeadSet;

    /**
    * Ending list.
    */
    @SerializedName("TailSet")
    @Expose
    private MediaInputInfo [] TailSet;

    /**
     * Get Opening scene list. 
     * @return HeadSet Opening scene list.
     */
    public MediaInputInfo [] getHeadSet() {
        return this.HeadSet;
    }

    /**
     * Set Opening scene list.
     * @param HeadSet Opening scene list.
     */
    public void setHeadSet(MediaInputInfo [] HeadSet) {
        this.HeadSet = HeadSet;
    }

    /**
     * Get Ending list. 
     * @return TailSet Ending list.
     */
    public MediaInputInfo [] getTailSet() {
        return this.TailSet;
    }

    /**
     * Set Ending list.
     * @param TailSet Ending list.
     */
    public void setTailSet(MediaInputInfo [] TailSet) {
        this.TailSet = TailSet;
    }

    public HeadTailParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeadTailParameter(HeadTailParameter source) {
        if (source.HeadSet != null) {
            this.HeadSet = new MediaInputInfo[source.HeadSet.length];
            for (int i = 0; i < source.HeadSet.length; i++) {
                this.HeadSet[i] = new MediaInputInfo(source.HeadSet[i]);
            }
        }
        if (source.TailSet != null) {
            this.TailSet = new MediaInputInfo[source.TailSet.length];
            for (int i = 0; i < source.TailSet.length; i++) {
                this.TailSet[i] = new MediaInputInfo(source.TailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HeadSet.", this.HeadSet);
        this.setParamArrayObj(map, prefix + "TailSet.", this.TailSet);

    }
}

