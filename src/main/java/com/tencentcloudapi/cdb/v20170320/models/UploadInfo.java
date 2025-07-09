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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadInfo extends AbstractModel {

    /**
    * Number of parts of file
    */
    @SerializedName("AllSliceNum")
    @Expose
    private Long AllSliceNum;

    /**
    * Number of completed parts
    */
    @SerializedName("CompleteNum")
    @Expose
    private Long CompleteNum;

    /**
     * Get Number of parts of file 
     * @return AllSliceNum Number of parts of file
     */
    public Long getAllSliceNum() {
        return this.AllSliceNum;
    }

    /**
     * Set Number of parts of file
     * @param AllSliceNum Number of parts of file
     */
    public void setAllSliceNum(Long AllSliceNum) {
        this.AllSliceNum = AllSliceNum;
    }

    /**
     * Get Number of completed parts 
     * @return CompleteNum Number of completed parts
     */
    public Long getCompleteNum() {
        return this.CompleteNum;
    }

    /**
     * Set Number of completed parts
     * @param CompleteNum Number of completed parts
     */
    public void setCompleteNum(Long CompleteNum) {
        this.CompleteNum = CompleteNum;
    }

    public UploadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadInfo(UploadInfo source) {
        if (source.AllSliceNum != null) {
            this.AllSliceNum = new Long(source.AllSliceNum);
        }
        if (source.CompleteNum != null) {
            this.CompleteNum = new Long(source.CompleteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllSliceNum", this.AllSliceNum);
        this.setParamSimple(map, prefix + "CompleteNum", this.CompleteNum);

    }
}

