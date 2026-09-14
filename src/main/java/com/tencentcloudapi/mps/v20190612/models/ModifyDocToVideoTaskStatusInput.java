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

public class ModifyDocToVideoTaskStatusInput extends AbstractModel {

    /**
    * <p>Modification action type.</p><p>Enumeration values:</p><ul><li>confirm: Confirm completion of the stage and advance to the next stage</li><li>regenerate: Regenerate the specified stage</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Modify the target stage.</p><p>Enumeration values:</p><ul><li>STAGE_1:<br>When Action=confirm: confirm the outline, continue generating subsequent dubbing, animation effects, and subtitles;<br>When Action=regenerate: regenerate the outline.</li></ul><ul><li>STAGE_2:<br>When Action=confirm: confirm the generated dubbing, animation effects, and subtitles, and generate the final video;<br>When Action=regenerate: regenerate the dubbing, animation effects, and subtitles.</li></ul>
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * <p>ID of the target task that needs to be modified.</p>
    */
    @SerializedName("SourceTaskId")
    @Expose
    private String SourceTaskId;

    /**
    * <p>Regenerate the parameter.</p><p>Required only when Action=regenerate.</p>
    */
    @SerializedName("Regenerate")
    @Expose
    private DocToVideoRegenerateInput Regenerate;

    /**
     * Get <p>Modification action type.</p><p>Enumeration values:</p><ul><li>confirm: Confirm completion of the stage and advance to the next stage</li><li>regenerate: Regenerate the specified stage</li></ul> 
     * @return Action <p>Modification action type.</p><p>Enumeration values:</p><ul><li>confirm: Confirm completion of the stage and advance to the next stage</li><li>regenerate: Regenerate the specified stage</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Modification action type.</p><p>Enumeration values:</p><ul><li>confirm: Confirm completion of the stage and advance to the next stage</li><li>regenerate: Regenerate the specified stage</li></ul>
     * @param Action <p>Modification action type.</p><p>Enumeration values:</p><ul><li>confirm: Confirm completion of the stage and advance to the next stage</li><li>regenerate: Regenerate the specified stage</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Modify the target stage.</p><p>Enumeration values:</p><ul><li>STAGE_1:<br>When Action=confirm: confirm the outline, continue generating subsequent dubbing, animation effects, and subtitles;<br>When Action=regenerate: regenerate the outline.</li></ul><ul><li>STAGE_2:<br>When Action=confirm: confirm the generated dubbing, animation effects, and subtitles, and generate the final video;<br>When Action=regenerate: regenerate the dubbing, animation effects, and subtitles.</li></ul> 
     * @return Stage <p>Modify the target stage.</p><p>Enumeration values:</p><ul><li>STAGE_1:<br>When Action=confirm: confirm the outline, continue generating subsequent dubbing, animation effects, and subtitles;<br>When Action=regenerate: regenerate the outline.</li></ul><ul><li>STAGE_2:<br>When Action=confirm: confirm the generated dubbing, animation effects, and subtitles, and generate the final video;<br>When Action=regenerate: regenerate the dubbing, animation effects, and subtitles.</li></ul>
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set <p>Modify the target stage.</p><p>Enumeration values:</p><ul><li>STAGE_1:<br>When Action=confirm: confirm the outline, continue generating subsequent dubbing, animation effects, and subtitles;<br>When Action=regenerate: regenerate the outline.</li></ul><ul><li>STAGE_2:<br>When Action=confirm: confirm the generated dubbing, animation effects, and subtitles, and generate the final video;<br>When Action=regenerate: regenerate the dubbing, animation effects, and subtitles.</li></ul>
     * @param Stage <p>Modify the target stage.</p><p>Enumeration values:</p><ul><li>STAGE_1:<br>When Action=confirm: confirm the outline, continue generating subsequent dubbing, animation effects, and subtitles;<br>When Action=regenerate: regenerate the outline.</li></ul><ul><li>STAGE_2:<br>When Action=confirm: confirm the generated dubbing, animation effects, and subtitles, and generate the final video;<br>When Action=regenerate: regenerate the dubbing, animation effects, and subtitles.</li></ul>
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get <p>ID of the target task that needs to be modified.</p> 
     * @return SourceTaskId <p>ID of the target task that needs to be modified.</p>
     */
    public String getSourceTaskId() {
        return this.SourceTaskId;
    }

    /**
     * Set <p>ID of the target task that needs to be modified.</p>
     * @param SourceTaskId <p>ID of the target task that needs to be modified.</p>
     */
    public void setSourceTaskId(String SourceTaskId) {
        this.SourceTaskId = SourceTaskId;
    }

    /**
     * Get <p>Regenerate the parameter.</p><p>Required only when Action=regenerate.</p> 
     * @return Regenerate <p>Regenerate the parameter.</p><p>Required only when Action=regenerate.</p>
     */
    public DocToVideoRegenerateInput getRegenerate() {
        return this.Regenerate;
    }

    /**
     * Set <p>Regenerate the parameter.</p><p>Required only when Action=regenerate.</p>
     * @param Regenerate <p>Regenerate the parameter.</p><p>Required only when Action=regenerate.</p>
     */
    public void setRegenerate(DocToVideoRegenerateInput Regenerate) {
        this.Regenerate = Regenerate;
    }

    public ModifyDocToVideoTaskStatusInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocToVideoTaskStatusInput(ModifyDocToVideoTaskStatusInput source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.SourceTaskId != null) {
            this.SourceTaskId = new String(source.SourceTaskId);
        }
        if (source.Regenerate != null) {
            this.Regenerate = new DocToVideoRegenerateInput(source.Regenerate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "SourceTaskId", this.SourceTaskId);
        this.setParamObj(map, prefix + "Regenerate.", this.Regenerate);

    }
}

