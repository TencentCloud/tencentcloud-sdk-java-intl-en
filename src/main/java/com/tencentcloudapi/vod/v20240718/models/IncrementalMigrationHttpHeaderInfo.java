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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpHeaderInfo extends AbstractModel {

    /**
    * HTTP Header Passthrough Mode. Values valid:
<li>FOLLOW_ALL: Pass through all header information;<\li>
<li>FOLLOW_PART: Pass through partial header information;<\li>
<li>IGNORE_PART: Ignore partial header information.<\li>
    */
    @SerializedName("HeaderFollowMode")
    @Expose
    private String HeaderFollowMode;

    /**
    * Header Key Set for Passthrough. This field is required only when the HeaderFollowMode is set to `FOLLOW_PART`.
    */
    @SerializedName("FollowHttpHeaderKeySet")
    @Expose
    private String [] FollowHttpHeaderKeySet;

    /**
    * Add Header Key-Value Pair Collection.
    */
    @SerializedName("NewHttpHeaderSet")
    @Expose
    private IncrementalMigrationHttpHeader [] NewHttpHeaderSet;

    /**
     * Get HTTP Header Passthrough Mode. Values valid:
<li>FOLLOW_ALL: Pass through all header information;<\li>
<li>FOLLOW_PART: Pass through partial header information;<\li>
<li>IGNORE_PART: Ignore partial header information.<\li> 
     * @return HeaderFollowMode HTTP Header Passthrough Mode. Values valid:
<li>FOLLOW_ALL: Pass through all header information;<\li>
<li>FOLLOW_PART: Pass through partial header information;<\li>
<li>IGNORE_PART: Ignore partial header information.<\li>
     */
    public String getHeaderFollowMode() {
        return this.HeaderFollowMode;
    }

    /**
     * Set HTTP Header Passthrough Mode. Values valid:
<li>FOLLOW_ALL: Pass through all header information;<\li>
<li>FOLLOW_PART: Pass through partial header information;<\li>
<li>IGNORE_PART: Ignore partial header information.<\li>
     * @param HeaderFollowMode HTTP Header Passthrough Mode. Values valid:
<li>FOLLOW_ALL: Pass through all header information;<\li>
<li>FOLLOW_PART: Pass through partial header information;<\li>
<li>IGNORE_PART: Ignore partial header information.<\li>
     */
    public void setHeaderFollowMode(String HeaderFollowMode) {
        this.HeaderFollowMode = HeaderFollowMode;
    }

    /**
     * Get Header Key Set for Passthrough. This field is required only when the HeaderFollowMode is set to `FOLLOW_PART`. 
     * @return FollowHttpHeaderKeySet Header Key Set for Passthrough. This field is required only when the HeaderFollowMode is set to `FOLLOW_PART`.
     */
    public String [] getFollowHttpHeaderKeySet() {
        return this.FollowHttpHeaderKeySet;
    }

    /**
     * Set Header Key Set for Passthrough. This field is required only when the HeaderFollowMode is set to `FOLLOW_PART`.
     * @param FollowHttpHeaderKeySet Header Key Set for Passthrough. This field is required only when the HeaderFollowMode is set to `FOLLOW_PART`.
     */
    public void setFollowHttpHeaderKeySet(String [] FollowHttpHeaderKeySet) {
        this.FollowHttpHeaderKeySet = FollowHttpHeaderKeySet;
    }

    /**
     * Get Add Header Key-Value Pair Collection. 
     * @return NewHttpHeaderSet Add Header Key-Value Pair Collection.
     */
    public IncrementalMigrationHttpHeader [] getNewHttpHeaderSet() {
        return this.NewHttpHeaderSet;
    }

    /**
     * Set Add Header Key-Value Pair Collection.
     * @param NewHttpHeaderSet Add Header Key-Value Pair Collection.
     */
    public void setNewHttpHeaderSet(IncrementalMigrationHttpHeader [] NewHttpHeaderSet) {
        this.NewHttpHeaderSet = NewHttpHeaderSet;
    }

    public IncrementalMigrationHttpHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpHeaderInfo(IncrementalMigrationHttpHeaderInfo source) {
        if (source.HeaderFollowMode != null) {
            this.HeaderFollowMode = new String(source.HeaderFollowMode);
        }
        if (source.FollowHttpHeaderKeySet != null) {
            this.FollowHttpHeaderKeySet = new String[source.FollowHttpHeaderKeySet.length];
            for (int i = 0; i < source.FollowHttpHeaderKeySet.length; i++) {
                this.FollowHttpHeaderKeySet[i] = new String(source.FollowHttpHeaderKeySet[i]);
            }
        }
        if (source.NewHttpHeaderSet != null) {
            this.NewHttpHeaderSet = new IncrementalMigrationHttpHeader[source.NewHttpHeaderSet.length];
            for (int i = 0; i < source.NewHttpHeaderSet.length; i++) {
                this.NewHttpHeaderSet[i] = new IncrementalMigrationHttpHeader(source.NewHttpHeaderSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderFollowMode", this.HeaderFollowMode);
        this.setParamArraySimple(map, prefix + "FollowHttpHeaderKeySet.", this.FollowHttpHeaderKeySet);
        this.setParamArrayObj(map, prefix + "NewHttpHeaderSet.", this.NewHttpHeaderSet);

    }
}

