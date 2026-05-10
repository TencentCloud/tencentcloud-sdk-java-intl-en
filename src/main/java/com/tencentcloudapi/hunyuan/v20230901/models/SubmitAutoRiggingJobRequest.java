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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitAutoRiggingJobRequest extends AbstractModel {

    /**
    * <p>3D Character Model File: Generates a 3D character animation based on the provided source model.<br>The character model must be in a standard T-Pose (a standing posture with both arms extended horizontally). You must select exactly one of the following 3D model file options; reference specifications:<br>fbx: 3D model file in FBX format; file size must not exceed 60 MB.<br>obj: 3D model file in OBJ format; file size must not exceed 60 MB.</p>
    */
    @SerializedName("File3D")
    @Expose
    private InputFile3D File3D;

    /**
    * <p>Preset Action Types (Reference Values):</p><ol><li>Roundhouse Kick </li><li>Left Hook </li><li>Charged Attack </li><li>Charged Punch </li><li>Two-Hit Combo </li><li>Two-Hit Combo - 2 </li><li>Backstep </li><li>Hit Reaction </li><li>Hit Reaction - 2 </li><li>Hit Reaction - 3 </li><li>Knockdown - 1 </li><li>Knockdown - 2 </li><li>Landing </li><li>Dejection </li><li>Throat Slash </li><li>Jab </li><li>Continuous Strikes </li><li>Kick </li><li>Side Kick </li><li>Tai Chi </li><li>Backflip </li><li>Crouching Turn </li><li>Walk - 1 </li><li>Walk - 2 </li><li>Walk - 3 </li><li>Idle - 1 </li><li>Idle - 2 </li><li>Street Dance </li><li>The Twist </li><li>Turn Left </li><li>Turn Right </li><li>Jog </li><li>Jog - 2 </li><li>Run </li><li>Sprint - 1 </li><li>Sprint - 2 </li><li>Sprint - 3 </li><li>Jump (In Place) - 1 </li><li>Sliding Tackle </li><li>Long Jump (Forward) </li><li>Long Jump (Forward) - 2 </li><li>Vault </li><li>Intimidation </li><li>Fall Forward </li><li>Turn Right </li><li>Jump (In Place) - 2 </li><li>Turn Around </li><li>Send Shockwave</li></ol>
    */
    @SerializedName("MotionType")
    @Expose
    private Long MotionType;

    /**
     * Get <p>3D Character Model File: Generates a 3D character animation based on the provided source model.<br>The character model must be in a standard T-Pose (a standing posture with both arms extended horizontally). You must select exactly one of the following 3D model file options; reference specifications:<br>fbx: 3D model file in FBX format; file size must not exceed 60 MB.<br>obj: 3D model file in OBJ format; file size must not exceed 60 MB.</p> 
     * @return File3D <p>3D Character Model File: Generates a 3D character animation based on the provided source model.<br>The character model must be in a standard T-Pose (a standing posture with both arms extended horizontally). You must select exactly one of the following 3D model file options; reference specifications:<br>fbx: 3D model file in FBX format; file size must not exceed 60 MB.<br>obj: 3D model file in OBJ format; file size must not exceed 60 MB.</p>
     */
    public InputFile3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set <p>3D Character Model File: Generates a 3D character animation based on the provided source model.<br>The character model must be in a standard T-Pose (a standing posture with both arms extended horizontally). You must select exactly one of the following 3D model file options; reference specifications:<br>fbx: 3D model file in FBX format; file size must not exceed 60 MB.<br>obj: 3D model file in OBJ format; file size must not exceed 60 MB.</p>
     * @param File3D <p>3D Character Model File: Generates a 3D character animation based on the provided source model.<br>The character model must be in a standard T-Pose (a standing posture with both arms extended horizontally). You must select exactly one of the following 3D model file options; reference specifications:<br>fbx: 3D model file in FBX format; file size must not exceed 60 MB.<br>obj: 3D model file in OBJ format; file size must not exceed 60 MB.</p>
     */
    public void setFile3D(InputFile3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get <p>Preset Action Types (Reference Values):</p><ol><li>Roundhouse Kick </li><li>Left Hook </li><li>Charged Attack </li><li>Charged Punch </li><li>Two-Hit Combo </li><li>Two-Hit Combo - 2 </li><li>Backstep </li><li>Hit Reaction </li><li>Hit Reaction - 2 </li><li>Hit Reaction - 3 </li><li>Knockdown - 1 </li><li>Knockdown - 2 </li><li>Landing </li><li>Dejection </li><li>Throat Slash </li><li>Jab </li><li>Continuous Strikes </li><li>Kick </li><li>Side Kick </li><li>Tai Chi </li><li>Backflip </li><li>Crouching Turn </li><li>Walk - 1 </li><li>Walk - 2 </li><li>Walk - 3 </li><li>Idle - 1 </li><li>Idle - 2 </li><li>Street Dance </li><li>The Twist </li><li>Turn Left </li><li>Turn Right </li><li>Jog </li><li>Jog - 2 </li><li>Run </li><li>Sprint - 1 </li><li>Sprint - 2 </li><li>Sprint - 3 </li><li>Jump (In Place) - 1 </li><li>Sliding Tackle </li><li>Long Jump (Forward) </li><li>Long Jump (Forward) - 2 </li><li>Vault </li><li>Intimidation </li><li>Fall Forward </li><li>Turn Right </li><li>Jump (In Place) - 2 </li><li>Turn Around </li><li>Send Shockwave</li></ol> 
     * @return MotionType <p>Preset Action Types (Reference Values):</p><ol><li>Roundhouse Kick </li><li>Left Hook </li><li>Charged Attack </li><li>Charged Punch </li><li>Two-Hit Combo </li><li>Two-Hit Combo - 2 </li><li>Backstep </li><li>Hit Reaction </li><li>Hit Reaction - 2 </li><li>Hit Reaction - 3 </li><li>Knockdown - 1 </li><li>Knockdown - 2 </li><li>Landing </li><li>Dejection </li><li>Throat Slash </li><li>Jab </li><li>Continuous Strikes </li><li>Kick </li><li>Side Kick </li><li>Tai Chi </li><li>Backflip </li><li>Crouching Turn </li><li>Walk - 1 </li><li>Walk - 2 </li><li>Walk - 3 </li><li>Idle - 1 </li><li>Idle - 2 </li><li>Street Dance </li><li>The Twist </li><li>Turn Left </li><li>Turn Right </li><li>Jog </li><li>Jog - 2 </li><li>Run </li><li>Sprint - 1 </li><li>Sprint - 2 </li><li>Sprint - 3 </li><li>Jump (In Place) - 1 </li><li>Sliding Tackle </li><li>Long Jump (Forward) </li><li>Long Jump (Forward) - 2 </li><li>Vault </li><li>Intimidation </li><li>Fall Forward </li><li>Turn Right </li><li>Jump (In Place) - 2 </li><li>Turn Around </li><li>Send Shockwave</li></ol>
     */
    public Long getMotionType() {
        return this.MotionType;
    }

    /**
     * Set <p>Preset Action Types (Reference Values):</p><ol><li>Roundhouse Kick </li><li>Left Hook </li><li>Charged Attack </li><li>Charged Punch </li><li>Two-Hit Combo </li><li>Two-Hit Combo - 2 </li><li>Backstep </li><li>Hit Reaction </li><li>Hit Reaction - 2 </li><li>Hit Reaction - 3 </li><li>Knockdown - 1 </li><li>Knockdown - 2 </li><li>Landing </li><li>Dejection </li><li>Throat Slash </li><li>Jab </li><li>Continuous Strikes </li><li>Kick </li><li>Side Kick </li><li>Tai Chi </li><li>Backflip </li><li>Crouching Turn </li><li>Walk - 1 </li><li>Walk - 2 </li><li>Walk - 3 </li><li>Idle - 1 </li><li>Idle - 2 </li><li>Street Dance </li><li>The Twist </li><li>Turn Left </li><li>Turn Right </li><li>Jog </li><li>Jog - 2 </li><li>Run </li><li>Sprint - 1 </li><li>Sprint - 2 </li><li>Sprint - 3 </li><li>Jump (In Place) - 1 </li><li>Sliding Tackle </li><li>Long Jump (Forward) </li><li>Long Jump (Forward) - 2 </li><li>Vault </li><li>Intimidation </li><li>Fall Forward </li><li>Turn Right </li><li>Jump (In Place) - 2 </li><li>Turn Around </li><li>Send Shockwave</li></ol>
     * @param MotionType <p>Preset Action Types (Reference Values):</p><ol><li>Roundhouse Kick </li><li>Left Hook </li><li>Charged Attack </li><li>Charged Punch </li><li>Two-Hit Combo </li><li>Two-Hit Combo - 2 </li><li>Backstep </li><li>Hit Reaction </li><li>Hit Reaction - 2 </li><li>Hit Reaction - 3 </li><li>Knockdown - 1 </li><li>Knockdown - 2 </li><li>Landing </li><li>Dejection </li><li>Throat Slash </li><li>Jab </li><li>Continuous Strikes </li><li>Kick </li><li>Side Kick </li><li>Tai Chi </li><li>Backflip </li><li>Crouching Turn </li><li>Walk - 1 </li><li>Walk - 2 </li><li>Walk - 3 </li><li>Idle - 1 </li><li>Idle - 2 </li><li>Street Dance </li><li>The Twist </li><li>Turn Left </li><li>Turn Right </li><li>Jog </li><li>Jog - 2 </li><li>Run </li><li>Sprint - 1 </li><li>Sprint - 2 </li><li>Sprint - 3 </li><li>Jump (In Place) - 1 </li><li>Sliding Tackle </li><li>Long Jump (Forward) </li><li>Long Jump (Forward) - 2 </li><li>Vault </li><li>Intimidation </li><li>Fall Forward </li><li>Turn Right </li><li>Jump (In Place) - 2 </li><li>Turn Around </li><li>Send Shockwave</li></ol>
     */
    public void setMotionType(Long MotionType) {
        this.MotionType = MotionType;
    }

    public SubmitAutoRiggingJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitAutoRiggingJobRequest(SubmitAutoRiggingJobRequest source) {
        if (source.File3D != null) {
            this.File3D = new InputFile3D(source.File3D);
        }
        if (source.MotionType != null) {
            this.MotionType = new Long(source.MotionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File3D.", this.File3D);
        this.setParamSimple(map, prefix + "MotionType", this.MotionType);

    }
}

