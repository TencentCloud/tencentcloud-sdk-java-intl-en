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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyExposureTagRequest extends AbstractModel {

    /**
    * Boundary analysis ID set
    */
    @SerializedName("ExposureIDs")
    @Expose
    private Long [] ExposureIDs;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Remarks
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Boundary analysis ID set 
     * @return ExposureIDs Boundary analysis ID set
     */
    public Long [] getExposureIDs() {
        return this.ExposureIDs;
    }

    /**
     * Set Boundary analysis ID set
     * @param ExposureIDs Boundary analysis ID set
     */
    public void setExposureIDs(Long [] ExposureIDs) {
        this.ExposureIDs = ExposureIDs;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Remarks 
     * @return Comment Remarks
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Remarks
     * @param Comment Remarks
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public ModifyExposureTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExposureTagRequest(ModifyExposureTagRequest source) {
        if (source.ExposureIDs != null) {
            this.ExposureIDs = new Long[source.ExposureIDs.length];
            for (int i = 0; i < source.ExposureIDs.length; i++) {
                this.ExposureIDs[i] = new Long(source.ExposureIDs[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ExposureIDs.", this.ExposureIDs);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

