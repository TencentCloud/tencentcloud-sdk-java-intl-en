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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Advice extends AbstractModel {

    /**
    * Problem Description
    */
    @SerializedName("Problem")
    @Expose
    private String Problem;

    /**
    * Problem Details
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Recommended resolutions
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Risk level of the scaling group configuration. Valid values: <br>
<li>WARNING<br>
<li>CRITICAL<br>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
     * Get Problem Description 
     * @return Problem Problem Description
     */
    public String getProblem() {
        return this.Problem;
    }

    /**
     * Set Problem Description
     * @param Problem Problem Description
     */
    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    /**
     * Get Problem Details 
     * @return Detail Problem Details
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Problem Details
     * @param Detail Problem Details
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Recommended resolutions 
     * @return Solution Recommended resolutions
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Recommended resolutions
     * @param Solution Recommended resolutions
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Risk level of the scaling group configuration. Valid values: <br>
<li>WARNING<br>
<li>CRITICAL<br> 
     * @return Level Risk level of the scaling group configuration. Valid values: <br>
<li>WARNING<br>
<li>CRITICAL<br>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level of the scaling group configuration. Valid values: <br>
<li>WARNING<br>
<li>CRITICAL<br>
     * @param Level Risk level of the scaling group configuration. Valid values: <br>
<li>WARNING<br>
<li>CRITICAL<br>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public Advice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Advice(Advice source) {
        if (source.Problem != null) {
            this.Problem = new String(source.Problem);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Problem", this.Problem);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

