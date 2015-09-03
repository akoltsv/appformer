/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.livespark.formmodeler.editor.client.editor.fields;

import javax.enterprise.context.Dependent;

import org.livespark.formmodeler.editor.model.impl.basic.LongBoxFieldDefinition;
import org.livespark.formmodeler.editor.model.impl.basic.ShortBoxFieldDefinition;

/**
 * Created by pefernan on 7/27/15.
 */
@Dependent
public class ShortBoxLayoutComponent extends AbstractInputLayoutComponent<ShortBoxFieldDefinition> {

    public ShortBoxLayoutComponent() {
    }

    public ShortBoxLayoutComponent( String formId, ShortBoxFieldDefinition fieldDefinition ) {
        init( formId, fieldDefinition );
    }

    @Override
    public ShortBoxLayoutComponent newInstance( String formId, ShortBoxFieldDefinition fieldDefinition ) {
        return new ShortBoxLayoutComponent( formId, fieldDefinition );
    }

    @Override
    public String getSupportedFieldDefinition() {
        return ShortBoxFieldDefinition.class.getName();
    }
}
