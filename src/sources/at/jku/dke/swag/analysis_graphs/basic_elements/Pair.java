package at.jku.dke.swag.analysis_graphs.basic_elements;

import at.jku.dke.swag.analysis_graphs.Copiable;

import java.util.Objects;

public class Pair implements PairOrConstant, Copiable {

    private Parameter parameter;

    private ConstantOrUnknown constantOrUnknown;

    public Pair(Parameter parameter, ConstantOrUnknown contant) {
        this.parameter = parameter;
        this.constantOrUnknown = contant;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public ConstantOrUnknown getConstant() {
        return constantOrUnknown;
    }

    public void setConstant(ConstantOrUnknown constantOrUnknown) {
        this.constantOrUnknown = constantOrUnknown;
    }

    @Override
    public boolean isConstantOrUnknown() {
        return false;
    }

    @Override
    public boolean isPair() {
        return true;
    }

    @Override
    public boolean isStrictlyUnknown() {
        return false;
    }

    @Override
    public boolean isStrictlyConstant() {
        return false;
    }


    public ConstantOrUnknown getConstantOrUnknown() {
        return constantOrUnknown;
    }

    public void setConstantOrUnknown(ConstantOrUnknown constantOrUnknown) {
        this.constantOrUnknown = constantOrUnknown;
    }

    public String toString() {
        return "(" + this.getParameter() + "," + this.getConstant() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(parameter, pair.parameter) && Objects.equals(constantOrUnknown, pair.constantOrUnknown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, constantOrUnknown);
    }

    @Override
    public Pair copy() {
        return new Pair(this.getParameter(), this.getConstant());
    }
}
