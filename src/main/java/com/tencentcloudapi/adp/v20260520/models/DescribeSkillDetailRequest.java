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

public class DescribeSkillDetailRequest extends AbstractModel {

    /**
    * skillID
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * Space ID.
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * version Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - Perspective: Perspective enumeration, single string value. The length of Values must be 1. Multiple Values are deemed as illegal. It only acts on the trimming of version_list returned in the details AND does not determine the visibility of the api itself. Default if not passed: USER (USER = USER Perspective, version_list returns only launch versions / EDITOR = EDITOR Perspective, version_list returns ALL liveness versions / ALL = full Perspective, same as EDITOR)
    */
    @SerializedName("VersionFilterList")
    @Expose
    private Filter [] VersionFilterList;

    /**
     * Get skillID 
     * @return SkillId skillID
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set skillID
     * @param SkillId skillID
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get Space ID. 
     * @return SpaceId Space ID.
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID.
     * @param SpaceId Space ID.
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get version Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - Perspective: Perspective enumeration, single string value. The length of Values must be 1. Multiple Values are deemed as illegal. It only acts on the trimming of version_list returned in the details AND does not determine the visibility of the api itself. Default if not passed: USER (USER = USER Perspective, version_list returns only launch versions / EDITOR = EDITOR Perspective, version_list returns ALL liveness versions / ALL = full Perspective, same as EDITOR) 
     * @return VersionFilterList version Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - Perspective: Perspective enumeration, single string value. The length of Values must be 1. Multiple Values are deemed as illegal. It only acts on the trimming of version_list returned in the details AND does not determine the visibility of the api itself. Default if not passed: USER (USER = USER Perspective, version_list returns only launch versions / EDITOR = EDITOR Perspective, version_list returns ALL liveness versions / ALL = full Perspective, same as EDITOR)
     */
    public Filter [] getVersionFilterList() {
        return this.VersionFilterList;
    }

    /**
     * Set version Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - Perspective: Perspective enumeration, single string value. The length of Values must be 1. Multiple Values are deemed as illegal. It only acts on the trimming of version_list returned in the details AND does not determine the visibility of the api itself. Default if not passed: USER (USER = USER Perspective, version_list returns only launch versions / EDITOR = EDITOR Perspective, version_list returns ALL liveness versions / ALL = full Perspective, same as EDITOR)
     * @param VersionFilterList version Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - Perspective: Perspective enumeration, single string value. The length of Values must be 1. Multiple Values are deemed as illegal. It only acts on the trimming of version_list returned in the details AND does not determine the visibility of the api itself. Default if not passed: USER (USER = USER Perspective, version_list returns only launch versions / EDITOR = EDITOR Perspective, version_list returns ALL liveness versions / ALL = full Perspective, same as EDITOR)
     */
    public void setVersionFilterList(Filter [] VersionFilterList) {
        this.VersionFilterList = VersionFilterList;
    }

    public DescribeSkillDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillDetailRequest(DescribeSkillDetailRequest source) {
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.VersionFilterList != null) {
            this.VersionFilterList = new Filter[source.VersionFilterList.length];
            for (int i = 0; i < source.VersionFilterList.length; i++) {
                this.VersionFilterList[i] = new Filter(source.VersionFilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "VersionFilterList.", this.VersionFilterList);

    }
}

