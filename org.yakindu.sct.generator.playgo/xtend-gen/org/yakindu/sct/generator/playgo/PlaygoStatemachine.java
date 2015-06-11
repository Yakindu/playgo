package org.yakindu.sct.generator.playgo;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.yakindu.base.types.Type;
import org.yakindu.base.types.typesystem.GenericTypeSystem;
import org.yakindu.sct.generator.java.Statemachine;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sgen.GeneratorEntry;
import org.yakindu.sct.model.stext.stext.EventDefinition;
import org.yakindu.sct.model.stext.stext.InterfaceScope;

@SuppressWarnings("all")
public class PlaygoStatemachine extends Statemachine {
  @Override
  protected CharSequence content(final ExecutionFlow flow, final GeneratorEntry entry) {
    StringConcatenation _builder = new StringConcatenation();
    String _licenseText = this._genmodelEntries.getLicenseText(entry);
    _builder.append(_licenseText, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _implementationPackageName = this._genmodelEntries.getImplementationPackageName(flow, entry);
    _builder.append(_implementationPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    CharSequence _createImports = this.createImports(flow, entry);
    _builder.append(_createImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _statemachineClassName = this._naming.statemachineClassName(flow);
    _builder.append(_statemachineClassName, "");
    _builder.append(" extends ExecutionBridge implements ");
    String _statemachineInterfaceName = this._naming.statemachineInterfaceName(flow);
    _builder.append(_statemachineInterfaceName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _createFieldDeclarations = this.createFieldDeclarations(flow, entry);
    _builder.append(_createFieldDeclarations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _createConstructor = this.createConstructor(flow);
    _builder.append(_createConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _initFunction = this.initFunction(flow);
    _builder.append(_initFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _enterFunction = this.enterFunction(flow);
    _builder.append(_enterFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _exitFunction = this.exitFunction(flow);
    _builder.append(_exitFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _clearInEventsFunction = this.clearInEventsFunction(flow);
    _builder.append(_clearInEventsFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _clearOutEventsFunction = this.clearOutEventsFunction(flow);
    _builder.append(_clearOutEventsFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _isActiveFunction = this.isActiveFunction(flow);
    _builder.append(_isActiveFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _timingFunctions = this.timingFunctions(flow);
    _builder.append(_timingFunctions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _interfaceAccessors = this.interfaceAccessors(flow);
    _builder.append(_interfaceAccessors, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _internalScopeFunctions = this.internalScopeFunctions(flow);
    _builder.append(_internalScopeFunctions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _defaultInterfaceFunctions = this.defaultInterfaceFunctions(flow, entry);
    _builder.append(_defaultInterfaceFunctions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _functionImplementations = this.functionImplementations(flow);
    _builder.append(_functionImplementations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _runCycleFunction = this.runCycleFunction(flow);
    _builder.append(_runCycleFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _initialize = this.initialize(flow);
    _builder.append(_initialize, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _isFinal = this.isFinal(flow);
    _builder.append(_isFinal, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence createImports(final ExecutionFlow flow, final GeneratorEntry entry) {
    CharSequence _createImports = super.createImports(flow, entry);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import il.ac.wis.cs.playgo.playtoolkit.ebridge.ExecutionBridge;");
    return (_createImports + _builder.toString());
  }
  
  protected CharSequence initialize(final ExecutionFlow flow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public void initialize() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO Auto-generated method stub\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence isFinal(final ExecutionFlow flow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean isFinal() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO Auto-generated method stub\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence generateInEventDefinition(final EventDefinition event) {
    CharSequence _xblockexpression = null;
    {
      InterfaceScope _scope = this._navigation.scope(event);
      String _interfaceName = this._naming.getInterfaceName(_scope);
      final String className = _interfaceName.substring(3);
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _and = false;
        Type _type = event.getType();
        boolean _notEquals = (!Objects.equal(_type, null));
        if (!_notEquals) {
          _and = false;
        } else {
          Type _type_1 = event.getType();
          Type _type_2 = this._iTypeSystem.getType(GenericTypeSystem.VOID);
          boolean _isSame = this._iTypeSystem.isSame(_type_1, _type_2);
          boolean _not = (!_isSame);
          _and = _not;
        }
        if (_and) {
          _builder.append("public void raise");
          String _name = event.getName();
          String _asName = this._naming.asName(_name);
          _builder.append(_asName, "");
          _builder.append("(");
          Type _type_3 = event.getType();
          String _targetLanguageName = this._iCodegenTypeSystemAccess.getTargetLanguageName(_type_3);
          _builder.append(_targetLanguageName, "");
          _builder.append(" value) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _symbol = this._naming.getSymbol(event);
          _builder.append(_symbol, "\t");
          _builder.append(" = true;");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _valueIdentifier = this._naming.getValueIdentifier(event);
          _builder.append(_valueIdentifier, "\t");
          _builder.append(" = value;");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("systemEvent(\"");
          _builder.append(className, "\t");
          _builder.append("\", \"");
          String _name_1 = event.getName();
          _builder.append(_name_1, "\t");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("private ");
          Type _type_4 = event.getType();
          String _targetLanguageName_1 = this._iCodegenTypeSystemAccess.getTargetLanguageName(_type_4);
          _builder.append(_targetLanguageName_1, "");
          _builder.append(" get");
          String _name_2 = event.getName();
          String _asName_1 = this._naming.asName(_name_2);
          _builder.append(_asName_1, "");
          _builder.append("Value() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          CharSequence _illegalAccessValidation = this.getIllegalAccessValidation(event);
          _builder.append(_illegalAccessValidation, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("return ");
          String _valueIdentifier_1 = this._naming.getValueIdentifier(event);
          _builder.append(_valueIdentifier_1, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        } else {
          _builder.append("public void raise");
          String _name_3 = event.getName();
          String _asName_2 = this._naming.asName(_name_3);
          _builder.append(_asName_2, "");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _symbol_1 = this._naming.getSymbol(event);
          _builder.append(_symbol_1, "\t");
          _builder.append(" = true;");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("systemEvent(\"");
          _builder.append(className, "\t");
          _builder.append("\", \"");
          String _name_4 = event.getName();
          _builder.append(_name_4, "\t");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
